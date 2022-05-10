package com.kodilla.view;

import javafx.scene.image.Image;

import javafx.scene.layout.*;

public class Board extends AnchorPane {
    final int WIDTH = 600;
    final int HEIGHT = 600;
    final String backgroundURL = "file:src/main/resources/map.png";

    BackgroundImage backgroundImage = new BackgroundImage(
            new Image(backgroundURL),
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, false)
    );

    public Board() {
        setWidth(WIDTH);
        setHeight(HEIGHT);
        setBackground(new Background(backgroundImage));
    }
}
