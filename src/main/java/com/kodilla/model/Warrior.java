package com.kodilla.model;

import javafx.css.Match;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Warrior extends Enemy {
    private final static ImageView image = new ImageView("file:src/main/resources/warrior.png");

    public Warrior(int x, int y, int live, int strength, int magicPower) {
        super(x, y, image, live, strength, magicPower);

    }
}
