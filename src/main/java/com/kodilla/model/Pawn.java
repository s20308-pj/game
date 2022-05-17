package com.kodilla.model;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.util.Duration;

public abstract class Pawn extends StackPane {
    private int positionX;
    private int previousPositionX;
    private int positionY;
    private int previousPositionY;
    protected int live;
    protected int strength;
    protected int magicPower;

    protected String name;
    public Pawn(int positionX, int positionY, String imageURL) {
        setWidth(Init.WIDTH);
        setHeight(Init.HEIGHT);
        this.positionX = positionX;
        this.positionY = positionY;
        this.previousPositionX = positionX;
        this.previousPositionY = positionY;
        relocate(positionX * Init.WIDTH, positionY * Init.HEIGHT);
        getChildren().add(new ImageView(imageURL));
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

    public int getPreviousPositionX() {
        return previousPositionX;
    }

    public void setPreviousPositionX(int previousPositionX) {
        this.previousPositionX = previousPositionX;
    }

    public int getPreviousPositionY() {
        return previousPositionY;
    }

    public void setPreviousPositionY(int previousPositionY) {
        this.previousPositionY = previousPositionY;
    }

    public void changePosition(int x, int y) {
        setPositionX(x);
        setPositionY(y);
        relocate(positionX * Init.WIDTH, positionY * Init.HEIGHT);
    }

    public void changePositionToPreviousPosition() {
        setPositionX(previousPositionX);
        setPositionY(previousPositionY);
        relocate(positionX * Init.WIDTH, positionY * Init.HEIGHT);
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

    public String getName() {
        return name;
    }
}
