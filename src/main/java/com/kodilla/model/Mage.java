package com.kodilla.model;

import javafx.scene.image.ImageView;

public class Mage extends Enemy {
    private final static String image = "file:src/main/resources/mage.png";
    private final int MAGE_LIVE = 2;
    private final int MAGE_MAGIC_POWER = 4;
    private final int MAGE_STRENGTH = 1;

    public Mage(int x, int y, int mapIndex) {
        super(x, y, image);
        super.setLive(mapIndex * MAGE_LIVE);
        super.setStrength(mapIndex * MAGE_STRENGTH);
        super.setMagicPower(mapIndex * MAGE_MAGIC_POWER);
    }
}
