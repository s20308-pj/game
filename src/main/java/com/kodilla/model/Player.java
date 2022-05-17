package com.kodilla.model;

import javafx.scene.image.ImageView;

import java.util.Random;

public class Player extends Pawn {
    private int experience;

    public Player() {
        super(1, 10, Init.URL_PLAYER);
        this.name = "Gracz";
        this.live = 10;
        this.strength = 10;
        this.magicPower = 10;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}