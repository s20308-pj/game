package com.kodilla.controller;

import com.kodilla.model.*;
import javafx.scene.input.KeyCode;


import java.util.ArrayList;
import java.util.List;

public class Game {
    Player player = new Player();
    Move move = new Move();
    GameMap map = new GameMap();
    private final List<Enemy> enemyList = new ArrayList();

    public void setNewGame() {
        player.setLive(5);
        player.setStrength(5);
        player.setMagicPower(5);
        player.setPositionX(5);
        player.setPositionY(10);
        enemyList.clear();
    }

    public void move(KeyCode pressedKey) {
        switch (pressedKey) {
            case UP:

                move.moveUp(player, map.getMap());
                break;

            case DOWN:
                move.moveDown(player, map.getMap());
                break;

            case LEFT:
                move.moveLeft(player, map.getMap());
                break;

            case RIGHT:
                move.moveRight(player, map.getMap());
                break;
        }
        player.changePosition(player.getPositionX(), player.getPositionY());
    }

    public boolean isFiledToDrawEnemy() {
        return getMapIndex(player.getPositionX(), player.getPositionY()) == 1;
    }

    private int getMapIndex(int x, int y) {
        return map.getMapIndex(x, y);
    }

    public void drawFiled() {
        map.setMapIndex(player.getPositionX(), player.getPositionY(), Init.throwDice(2) + 1);
        switch (map.getMapIndex(player.getPositionX(), player.getPositionY())) {
            case 2:
                addMageToEnemyList(player.getPositionX(), player.getPositionY());
                break;
            case 3:
                addWarriorToEnemyList(player.getPositionX(), player.getPositionY());
                break;
        }
    }

    public void addMageToEnemyList(int x, int y) {
        enemyList.add(new Mage(x, y, 4));
    }

    public void addWarriorToEnemyList(int x, int y) {
        enemyList.add(new Warrior(x, y, 4));
    }

    public Enemy getEnemyFromEnemyList() {
        int x = player.getPositionX();
        int y = player.getPositionY();
        return enemyList.stream().filter(enemy -> enemy.getPositionX() == x).filter(enemy -> enemy.getPositionY() == y).findFirst().orElse(null);
    }
    public void removeEnemyFromList(){
        enemyList.remove(getEnemyFromEnemyList());
        map.setMapIndex(player.getPositionX(), player.getPositionY(), 1);
    }

    public Player getPlayer() {
        return player;
    }

    public int doActionOnFiled() {
        return getMapIndex(player.getPositionX(), player.getPositionY());
    }

    public boolean buyStrength() {
        if (player.getExperience() > 10) {
            player.setExperience(player.getExperience() - 10);
            player.setStrength(player.getStrength() + 1);
            return true;
        }
        return false;
    }

    public boolean buyMagicPower() {
        if (player.getExperience() > 10) {
            player.setExperience(player.getExperience() - 10);
            player.setMagicPower(player.getMagicPower() + 1);
            return true;
        }
        return false;
    }

    public boolean buyLive() {
        if (player.getExperience() > 10) {
            player.setExperience(player.getExperience() - 10);
            player.setLive(player.getLive() + 1);
            return true;
        }
        return false;
    }

    public boolean fight() {
        return getEnemyFromEnemyList().fight(player);
    }
}
