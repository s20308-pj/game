package com.kodilla.view;

import javafx.scene.image.Image;

import javafx.scene.layout.*;

public class Board extends AnchorPane {

    BackgroundImage backgroundImage = new BackgroundImage(new Image("file:src/main/resources/map.png"),
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, false));

    public Board(){
        int WIDTH = 600;
        setWidth(WIDTH);
        int HEIGHT = 600;
        setHeight(HEIGHT);
        setBackground(new Background(backgroundImage));
    }
}
