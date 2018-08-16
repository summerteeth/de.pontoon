package de.pontoon.model.impl;

import de.pontoon.model.ICard;

public class Card implements ICard {

    private String name;
    private int val;

    public Card(String name, int val) {
        this.name = name;
        this.val = val;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getValue() {
        return this.val;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
