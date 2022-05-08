package com.kodilla.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public abstract class Pawn extends StackPane {
    protected int positionX;
    protected int positionY;

    public Pawn(int x, int y, String imageURL) {
        setWidth(50);
        setHeight(50);
        this.positionX = x;
        this.positionY = y;
        relocate(x * 50, y * 50);
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

    public void changePosition(int x, int y) {
        this.positionX = x;
        this.positionY = y;
        setLayoutX(x * 50);
        setLayoutY(y * 50);
//        relocate(x * 50, y * 50);
    }
}