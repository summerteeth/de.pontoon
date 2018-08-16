package de.pontoon.controller;

import de.pontoon.model.IPlayer;
import de.pontoon.model.impl.Hand;
import de.pontoon.view.Tui;

public interface IPontoonController {

    /**
     *
     * Init player x as start
     *
     */
    void setPlayer();

    /**
     * Get current player
     *
     * @return: returns IPlayer
     */
    IPlayer getCurrentPlayer();

    /**
     * Returns the actual player
     *
     * @return: IPlayer.
     */
    IPlayer getPlayer();

    /**
     * Returns the bankier
     *
     * @return: IPlayer
     */
    IPlayer getBankier();

    /**
     *
     * Switches players.
     *
     */
    void switchPlayer();

    /**
     * Check if player's hand is over 21.
     *
     * @return: true -> hand <= 21
     */
    boolean checkHandsValue(Hand hand);

    /**
     *
     * Calculates winner after all players have finished their move.
     *
     */
    void calcWinner();

    /**
     *
     * Saves all winners in LinkedList; int index represents played round
     *
     */
    void getWinnerHistory();

}
