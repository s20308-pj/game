package com.kodilla.model;

public abstract class Enemy extends Pawn{

    public Enemy(int x, int y, String image) {
        super(x, y, image);
    }

    public abstract boolean fight(Player player);
}
