package com.kodilla.model;

import javafx.scene.image.ImageView;

public abstract class Enemy extends Pawn{

    protected int live;
    protected int strength;
    protected int magicPower;

    public Enemy(int x, int y, String image) {
        super(x, y, image);
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
}
