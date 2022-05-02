package com.kodilla.view.model;

import javafx.scene.image.ImageView;

public class Mage extends Pawn {
    private final static ImageView image = new ImageView("file:src/main/resources/mage.png");

    public Mage(int x, int y) {
        super(x, y, image);
    }
}
