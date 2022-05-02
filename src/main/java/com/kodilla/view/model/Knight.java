package com.kodilla.view.model;

import javafx.scene.image.ImageView;

public class Knight extends Pawn {
    private final static ImageView image = new ImageView("file:src/main/resources/knight.png");

    public Knight(int x, int y) {
        super(x, y, image);
    }
}
