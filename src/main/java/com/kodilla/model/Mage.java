package com.kodilla.model;

import javafx.scene.image.ImageView;

public class Mage extends Enemy {
    private final int MAGE_LIVE = 1;
    private final int MAGE_MAGIC_POWER = 2;
    private final int MAGE_STRENGTH = 1;

    public Mage(int x, int y, int mapIndex) {
        super(x, y, Init.URL_MAGE);
        this.name = "mag";
        this.live = mapIndex * MAGE_LIVE;
        this.strength = mapIndex * MAGE_STRENGTH;
        this.magicPower = mapIndex * MAGE_MAGIC_POWER;
    }
}
