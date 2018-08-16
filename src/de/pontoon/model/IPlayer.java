package de.pontoon.model;

import de.pontoon.model.impl.Hand;

public interface IPlayer {

    /**
     * Get player's name.
     *
     * @return name
     */
    String getName();

    /**
     * Get hand.
     *
     * @return hand
     */
    Hand getHand();

    /**
     * Create new hand.
     *
     * @return hand
     */
    Hand newHand();

    String toString();

}
