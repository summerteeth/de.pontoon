package de.pontoon.model.impl;

import de.pontoon.model.ICard;
import de.pontoon.model.IHand;

import java.util.ArrayList;
import java.util.List;

public class Hand implements IHand {

    private final Collection DECK = new Collection();
    private List<ICard> hand = new ArrayList<>();
    private int nCards = 1;
    private int handValue = 0;

    public Hand() {
        for (int i = 0; i < nCards; i++) {
            Card card = DECK.pull();
            hand.add(card);
            handValue += card.getValue();
        }
    }

    @Override
    public void addCard() {
        Card card = DECK.pull();
        hand.add(card);
        handValue += card.getValue();
    }

    @Override
    public int getHandValue() {
        return handValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.hand.size(); i++) {
            sb.append(hand.get(i).toString());
        }
        return sb.toString();
    }

}
