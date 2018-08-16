package de.pontoon.model;

public interface IHand {

    /**
     *
     * Add card to hand.
     *
     */
    void addCard();

    /**
     * Get total value of hand.
     *
     * @return HAND_VALUE
     */
    int getHandValue();

    String toString();

}
