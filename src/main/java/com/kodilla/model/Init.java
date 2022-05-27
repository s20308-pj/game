package com.kodilla.model;

import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.Random;

public class Init {
    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;


    public static final int PRIMARY_VIEW_WIDTH = WIDTH * 12;
    public static final int PRIMARY_VIEW_HEIGHT = HEIGHT * 12;
    public static final int BUTTON_WIDTH = WIDTH * 3;
    public static final int BUTTON_HEIGHT = HEIGHT;
    public static final int INFO_VIEW_WIDTH = WIDTH * 10;
    public static final int INFO_VIEW_HEIGHT = HEIGHT *10;

    public static final String URL_MAP_BG = "file:src/main/resources/map.png";
    public static final String URL_INFO_BG_5x4 = "file:src/main/resources/infoIMG500x400.png";
    public static final String URL_INFO_BG_5x3 = "file:src/main/resources/infoIMG500x300.png";
    public static final String URL_INFO_BG = "file:src/main/resources/infoIMG.png";
    public static final String URL_MENU_BG = "file:src/main/resources/papyrus.png";
    public static final String URL_MAGE = "file:src/main/resources/mage.png";
    public static final String URL_WARRIOR = "file:src/main/resources/warrior.png";
    public static final String URL_PLAYER = "file:src/main/resources/knight.png";
    public static final String URL_BUTTON_PRESSED = "file:src/main/resources/buttonPressed.png";
    public static final String URL_BUTTON_RELEASED = "file:src/main/resources/buttonRelease.png";
    public static final String URL_SWORD = "file:src/main/resources/crossedSword.png";
    public static final String URL_CITY = "file:src/main/resources/city.png";
    public static final String URL_TEMPLE = "file:src/main/resources/temple.png";
    public static final String URL_TOWER = "file:src/main/resources/tower.png";
    public static final String URL_CROSS_ROAD = "file:src/main/resources/crossRoad.png";

    public static final Font BUTTON_FONT = Font.font("Comic Sans MS", FontWeight.BOLD,20);
    public static final Font TEXT_FONT = Font.font("Comic Sans MS", FontWeight.BOLD,16);
    public static final String  CITY_TEXT = "Dotarles do miasta\nmozesz tu zwiekszyc sile\ncena:\n10 punktow \ndoswiadczenia";
    public static final String  TOWER_TEXT = "Dotarles wiezy\nmozesz tu zwiekszyc magie\ncena:\n10 punktow \ndoswiadczenia";
    public static final String  TEMPLE_TEXT = "Dotarles do kapliczki\nmozesz tu zwiekszyc zycie\ncena:\n10 punktow \ndoswiadczenia";

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

    public static String drawImage() {
            String image = URL_TOWER;
        switch (throwDice(3)){
            case 1:
                image = URL_TEMPLE;
                break;
            case 2:
                image = URL_CROSS_ROAD;
                break;
        }
        return image;
    }
}
