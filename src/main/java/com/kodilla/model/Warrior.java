package com.kodilla.model;

import javafx.geometry.Pos;

public class Warrior extends Enemy {
    private final int WARRIOR_LIVE = 1;
    private final int WARRIOR_STRENGTH = 2;
    private final int WARRIOR_MAGIC_POWER = 1;

    public Warrior(int x, int y, int mapIndex) {
        super(x, y, Init.URL_WARRIOR);
        this.setAlignment(Pos.CENTER);
        this.name = "Wojownik";
        this.live = WARRIOR_LIVE;
        this.strength = WARRIOR_STRENGTH + Init.throwDice(mapIndex);
        this.magicPower = mapIndex + Init.throwDice(mapIndex);
    }
}
