package de.pontoon.model;

import de.pontoon.model.impl.Card;

public interface ICollection {

    /**
     * Pull card of deck.
     *
     * @return: Card
     */
    Card pull();
}
