package com.kodilla.model;

import javafx.scene.image.ImageView;

public class Warrior extends Enemy {
    private final static String image = "file:src/main/resources/warrior.png";
    private final int WARRIOR_LIVE = 3;
    private final int WARRIOR_STRENGTH = 4;
    private final int WARRIOR_MAGIC_POWER = 1;

    public Warrior(int x, int y, int mapIndex) {
        super(x, y, image);
        super.setLive(mapIndex * WARRIOR_LIVE);
        super.setStrength(mapIndex * WARRIOR_STRENGTH);
        super.setMagicPower(mapIndex * WARRIOR_MAGIC_POWER);
    }
}
