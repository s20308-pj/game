package com.kodilla.model;

public abstract class Enemy extends Pawn {

    public Enemy(int x, int y, String image) {
        super(x, y, image);
    }

    public abstract int fight(Player player);

    protected int fightResult(int playerPower, int enemyPower, Player player) {
        if (playerPower == enemyPower) {
            return 0;
        } else if (playerPower > enemyPower) {
            player.setExperience(player.getExperience() + enemyPower);
            this.setLive(0);
            return 1;
        } else {
            player.setLive(player.getLive() - 1);
            return 2;
        }
    }
}

