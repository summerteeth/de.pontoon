package de.pontoon.controller.impl;

import de.pontoon.model.IPlayer;
import de.pontoon.model.impl.Hand;
import de.pontoon.model.impl.Player;
import de.pontoon.util.observer.Observable;

import java.util.LinkedList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PontoonController extends Observable {

    private IPlayer player, bankier, currentPlayer;
    private LinkedList winner = new LinkedList();
    private static final Logger LOGGER = LoggerFactory.getLogger(PontoonController.class.getName());
    public int rounds = 1;

    public PontoonController() {
        create();
    }

    public void create() {
        player = new Player("Player 1");
        bankier = new Player("Bankier");
        setPlayer();
        notifyObservers();
    }

    public void round() {
        player.newHand();
        bankier.newHand();
        setPlayer();
        notifyObservers();
    }

    public void addCard() {
        currentPlayer.getHand().addCard();
        notifyObservers();
    }

    public int getHandValue() {
        int val = currentPlayer.getHand().getHandValue();
        LOGGER.info("Value of " + currentPlayer.getName() + "'s hand is " + Integer.toString(val) + ".");
        return val;
    }

    public void switchPlayer() {
        if (currentPlayer == player) {
            currentPlayer = bankier;
        } else {
            currentPlayer = player;
        }
    }

    public boolean checkHandsValue(Hand hand) {
        if (hand.getHandValue() <= 21) {
            return true;
        } else {
            LOGGER.info(currentPlayer.getName() + "'s hand is over 21.");
            round();
            rounds += 1;
            return true;
        }
    }

    public void calcWinner() {
        if (getPlayer().getHand().getHandValue() > getBankier().getHand().getHandValue()) {
            winner.add(rounds-1, getPlayer().getName());
        } else if (getPlayer().getHand().getHandValue() < getBankier().getHand().getHandValue()) {
            winner.add(rounds-1, getBankier().getName());
        } else {
            winner.add(rounds-1, "Tied");
        }
        System.out.println("The winner of round " + rounds + " is " + winner.get(rounds - 1));
        rounds += 1;
    }

    public void getWinnerHistory() { LOGGER.info("Winner history " + winner + " in " + rounds + " rounds."); }

    public IPlayer getCurrentPlayer() {
        return currentPlayer;
    }

    public IPlayer getPlayer() { return player; }

    public IPlayer getBankier() {
        return bankier;
    }

    public void setPlayer() {
        currentPlayer = player;
    }

}
