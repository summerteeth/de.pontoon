package de.pontoon.model.impl;

import de.pontoon.model.IPlayer;

public class Player implements IPlayer {

    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Hand getHand() { return this.hand; }

    @Override
    public Hand newHand() { return this.hand = new Hand(); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(this.hand);
        return sb.toString();
    }

}
