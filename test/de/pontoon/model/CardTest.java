package de.pontoon.model;

import de.pontoon.model.impl.Card;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CardTest {

    /* Fields */
    private static Card card;

    /* Setup */
    @Before
    public void setUp() throws Exception {
        card = new Card("♥A", 11);
    }

    /* Tests */
    @Test
    public void testGetName() {
        assertEquals("♥A", card.getName());
    }

    @Test
    public void testGetValue() {
        assertEquals(11, card.getValue());
    }

    @Test
    public void testToString() {
        assertEquals("♥A", card.toString());
    }

}
