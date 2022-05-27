package com.kodilla.model;

import javafx.geometry.Pos;

public class Warrior extends Enemy {
    private final int WARRIOR_LIVE = 1;
    private final int WARRIOR_STRENGTH = 2;

    public Warrior(int x, int y, int mapIndex) {
        super(x, y, Init.URL_WARRIOR);
        this.setAlignment(Pos.CENTER);
        this.name = "Wojownik";
        this.live = WARRIOR_LIVE;
        this.strength = WARRIOR_STRENGTH + Init.throwDice(4);
        this.magicPower = Init.throwDice(4);
    }

    @Override
    public int fight(Player player) {
        int enemyPower = this.getStrength() + Init.throwDice(4);
        int playerPower = player.getStrength() + Init.throwDice(4);
        return fightResult(playerPower,enemyPower,player);
    }

}
