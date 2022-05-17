package com.kodilla.controller;

import com.kodilla.model.*;

public class Fight {
    public boolean fight(Player player, Enemy enemy) {
        if (enemy instanceof Warrior) {
            if (fightResult(player.getStrength(), enemy.getStrength())) {
                player.setExperience(player.getExperience() + enemy.getStrength());
                enemy.setLive(0);
                return true;
            } else {
                player.setLive(player.getLive() - 1);
                player.changePositionToPreviousPosition();
            }
        } else if (enemy instanceof Mage) {
            if (fightResult(player.getMagicPower(), enemy.getMagicPower())) {
                player.setExperience(player.getExperience() + enemy.getMagicPower());
                enemy.setLive(0);
                return true;
            } else {
                player.setLive(player.getLive() - 1);
                player.changePositionToPreviousPosition();
            }
        }
        return false;
    }

    private boolean fightResult(int playerPower, int enemyPower) {

        playerPower = playerPower + Init.throwDice(6);
        enemyPower = enemyPower * Init.throwDice(6);
        if (playerPower > enemyPower) {
            return true;
        }
        return false;
    }
}
