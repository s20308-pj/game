package com.kodilla.model;

import javafx.scene.image.ImageView;

public class Player extends Pawn{
    private final static ImageView image = new ImageView("file:src/main/resources/knight.png");
    private int positionX;
    private int positionY;
    private int live;
    private int strength;
    private int magicPower;

    public Player()  {
        super(1,10, image);
        this.positionX = 1;

        this.positionY = 10;
        this.live = 10;
        this.strength = 10;
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
