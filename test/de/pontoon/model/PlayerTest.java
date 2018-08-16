package de.pontoon.model;

import static org.junit.Assert.*;
import de.pontoon.model.impl.Hand;
import de.pontoon.model.impl.Player;
import org.junit.Test;

public class PlayerTest {

    /* Fields */
    private String name;
    private Hand hand = new Hand();

    /* Setup */
    Player pl = new Player("Player 1");

    /* Tests */
    @Test
    public void testGetName() {
        assertEquals("Player 1", pl.getName());
    }

    @Test
    public void testGetHand() {
        assertTrue(pl.getHand() != null);
    }

    @Test
    public void testNewHand() {
        Hand copy = pl.getHand();
        Hand after = pl.newHand();
        assertTrue(copy != after);
    }

}
