package de.pontoon.model.impl;

import de.pontoon.model.ICollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collection implements ICollection {

    private List<Card> deck = new LinkedList<Card>();

    public Collection() {

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

        Collections.shuffle(deck);

    }

    public Card pull() {
        return ((LinkedList<Card>) this.deck).poll();
    }

}
