package de.pontoon.model;

import de.pontoon.model.impl.Card;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {

    /* Fields */
    private List<Card> deck = new LinkedList<Card>();

    /* Setup */
    @Before
    public void setUpDeck() throws Exception {

        this.deck.add(new Card("♣A", 11));
        this.deck.add(new Card("♦A", 11));
        this.deck.add(new Card("♥A", 11));
        this.deck.add(new Card("♠A", 11));

        this.deck.add(new Card("♣K", 10));
        this.deck.add(new Card("♦K", 10));
        this.deck.add(new Card("♥K", 10));
        this.deck.add(new Card("♠K", 10));

        this.deck.add(new Card("♣Q", 10));
        this.deck.add(new Card("♦Q", 10));
        this.deck.add(new Card("♥Q", 10));
        this.deck.add(new Card("♠Q", 10));

        this.deck.add(new Card("♣J", 10));
        this.deck.add(new Card("♦J", 10));
        this.deck.add(new Card("♥J", 10));
        this.deck.add(new Card("♠J", 10));

        this.deck.add(new Card("♣10", 10));
        this.deck.add(new Card("♦10", 10));
        this.deck.add(new Card("♥10", 10));
        this.deck.add(new Card("♠10", 10));

        this.deck.add(new Card("♣9", 9));
        this.deck.add(new Card("♦9", 9));
        this.deck.add(new Card("♥9", 9));
        this.deck.add(new Card("♠9", 9));

        this.deck.add(new Card("♣8", 8));
        this.deck.add(new Card("♦8", 8));
        this.deck.add(new Card("♥8", 8));
        this.deck.add(new Card("♠8", 8));

        this.deck.add(new Card("♣7", 7));
        this.deck.add(new Card("♦7", 7));
        this.deck.add(new Card("♥7", 7));
        this.deck.add(new Card("♠7", 7));

        this.deck.add(new Card("♣6", 6));
        this.deck.add(new Card("♦6", 6));
        this.deck.add(new Card("♥6", 6));
        this.deck.add(new Card("♠6", 6));

        this.deck.add(new Card("♣5", 5));
        this.deck.add(new Card("♦5", 5));
        this.deck.add(new Card("♥5", 5));
        this.deck.add(new Card("♠5", 5));

        this.deck.add(new Card("♣4", 4));
        this.deck.add(new Card("♦4", 4));
        this.deck.add(new Card("♥4", 4));
        this.deck.add(new Card("♠4", 4));

        this.deck.add(new Card("♣3", 3));
        this.deck.add(new Card("♦3", 3));
        this.deck.add(new Card("♥3", 3));
        this.deck.add(new Card("♠3", 3));

        this.deck.add(new Card("♣2", 2));
        this.deck.add(new Card("♦2", 2));
        this.deck.add(new Card("♥2", 2));
        this.deck.add(new Card("♠2", 2));

    }

    /* Tests */
    @Test
    public void testShuffle() {
        Card before = deck.get(10);
        Collections.shuffle(deck);
        Card after = deck.get(10);
        assertFalse(before == after);
    }

}