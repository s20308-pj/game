package com.kodilla.model;

public class Player {
    private int positionX;
    private int positionY;
    private int live;
    private int strange;
    private int magicPower;

    public Player() {
        this.positionX = 1;
        this.positionY = 10;
        this.live = 10;
        this.strange = 10;
        this.magicPower = 10;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
