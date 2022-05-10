package com.kodilla.model;

import javafx.scene.image.ImageView;

public class Player extends Pawn{
    private final static String image = "file:src/main/resources/knight.png";
    private int live;
    private int strength;
    private int magicPower;

    public Player()  {
        super(1,10, image);
        this.live = 10;
        this.strength = 10;
        this.magicPower = 10;
    }

}
