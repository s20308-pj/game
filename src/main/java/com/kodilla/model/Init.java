package com.kodilla.model;

import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.util.Random;

public class Init {
    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;

    public static final int MAIN_WINDOW_WIDTH = 12 * WIDTH;
    public static final int MAIN_WINDOW_HEIGHT = 12 * HEIGHT;
    public static final int INFO_WINDOW_WIDTH = 10 * WIDTH;
    public static final int INFO_WINDOW_HEIGHT = 10 * HEIGHT;

    public static final String URL_MAP_BG = "file:src/main/resources/map.png";
    public static final String URL_MAGE = "file:src/main/resources/mage.png";
    public static final String URL_WARRIOR = "file:src/main/resources/warrior.png";
    public static final String URL_PLAYER = "file:src/main/resources/knight.png";
    public static final String URL_INFO_BG = "file:src/main/resources/infoIMG.png";
    public static final String URL_BUTTON_PRESSED = "file:src/main/resources/buttonPressed.png";
    public static final String URL_BUTTON_RELEASED = "file:src/main/resources/buttonRelease.png";

    public static Background createBackground(String imageUrl) {
        BackgroundImage backgroundImage = new BackgroundImage(
                new Image(imageUrl),
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(100, 100, true, true, true, false)
        );
        return new Background(backgroundImage);
    }

    public static int throwDice(int drawRange) {
        return new Random().nextInt(drawRange) + 1;
    }
}
