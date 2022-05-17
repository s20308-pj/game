package com.kodilla.view;

import com.kodilla.model.Init;
import javafx.scene.image.Image;

import javafx.scene.layout.*;

public class Board extends AnchorPane {

    BackgroundImage backgroundImage = new BackgroundImage(
            new Image(Init.URL_MAP_BG),
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, false)
    );

    public Board() {
        setWidth(Init.MAIN_WINDOW_WIDTH);
        setHeight(Init.INFO_WINDOW_HEIGHT);
        setBackground(new Background(backgroundImage));
    }
}
