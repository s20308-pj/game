package com.kodilla.controller;

import com.kodilla.model.Enemy;
import com.kodilla.model.Mage;
import com.kodilla.model.Player;
import com.kodilla.model.Warrior;

import java.util.Random;

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
        Random random = new Random();
        playerPower = playerPower * random.nextInt(6) + 1;
        enemyPower = enemyPower * random.nextInt(6) + 1;
        if (playerPower > enemyPower) {
            return true;
        }
        return false;
    }
}
