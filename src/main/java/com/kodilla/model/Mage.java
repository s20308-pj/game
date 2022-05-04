package com.kodilla.model;

import javafx.scene.image.ImageView;

public class Mage extends Enemy {
    private final static ImageView image = new ImageView("file:src/main/resources/mage.png");


    public Mage(int x, int y, int live, int strength, int magicPower) {
        super(x, y, image, live, strength, magicPower);
    }
}
