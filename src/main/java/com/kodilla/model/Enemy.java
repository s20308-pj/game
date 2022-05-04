package com.kodilla.model;

import javafx.scene.image.ImageView;

public class Enemy extends Pawn{

    int live;
    int strange;
    int magicPower;

    public Enemy(int x, int y, ImageView image, int live, int strength, int magicPower) {
        super(x, y, image);
        this.live = live;
        this.strange = strength;
        this.magicPower = magicPower;
    }
}
