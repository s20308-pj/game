package com.kodilla.model;

import javafx.geometry.Pos;
import javafx.scene.image.ImageView;

public class Warrior extends Enemy {
    private final int WARRIOR_LIVE = 1;
    private final int WARRIOR_STRENGTH = 2;
    private final int WARRIOR_MAGIC_POWER = 1;

    public Warrior(int x, int y, int mapIndex) {
        super(x, y, Init.URL_WARRIOR);
        this.setAlignment(Pos.CENTER);
        this.name = "Wojownik";
        this.live = mapIndex * WARRIOR_LIVE;
        this.strength = mapIndex * WARRIOR_STRENGTH;
        this.magicPower = mapIndex * WARRIOR_MAGIC_POWER;
    }
}
