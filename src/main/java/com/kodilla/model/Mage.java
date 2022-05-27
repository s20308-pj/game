package com.kodilla.model;

public class Mage extends Enemy {
    private final int MAGE_LIVE = 1;
    private final int MAGE_MAGIC_POWER = 2;

    public Mage(int x, int y, int mapIndex) {
        super(x, y, Init.URL_MAGE);
        this.name = "Mag";
        this.live = MAGE_LIVE;
        this.strength = Init.throwDice(5);
        this.magicPower = MAGE_MAGIC_POWER + Init.throwDice(4);
    }

    public int fight(Player player) {
        int enemyPower = this.getMagicPower() + Init.throwDice(4);
        int playerPower = player.getMagicPower() + Init.throwDice(4);
        return fightResult(playerPower, enemyPower, player);
    }
}
