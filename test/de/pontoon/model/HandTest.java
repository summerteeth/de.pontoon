package de.pontoon.model;

import de.pontoon.model.impl.Card;
import static org.junit.Assert.*;

import de.pontoon.model.impl.Collection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HandTest {

    /* Fields */
    private final Collection DECK = new Collection();
    private List<ICard> hand = new ArrayList<>();
    private int nCards = 1;
    private int handValue = 0;

    /* Setup */
    @Before
    public void setUp() throws Exception {
        for (int i = 0; i < nCards; i++) {
            Card card = DECK.pull();
            hand.add(card);
            handValue += card.getValue();
        }
    }

    /* Tests */
    @Test
    public void testAddOneCard() {
        assertTrue(hand.size() == 1);
    }

    @Test
    public void testAddAnotherCard() {
        Card card = DECK.pull();
        hand.add(card);
        assertTrue(hand.size() == 2);
    }

    @Test
    public void testGetHandValue() {
        Card card = DECK.pull();
        assertTrue(card.getValue() > 0);
    }

    @Test
    public void testToString() {
        Card card = DECK.pull();
        hand.add(card);
        assertTrue(hand.toString() != null);
    }

}
