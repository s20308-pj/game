package com.kodilla.model;

import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public abstract class Pawn extends StackPane {
    public Pawn(int x, int y, ImageView image) {
        setWidth(50);
        setHeight(50);
        relocate(x * 50, y * 50);
        getChildren().add(image);
    }

    public void changePosition(int x, int y){
        relocate(x * 50,y* 50);
    }
}
