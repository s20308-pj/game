package com.kodilla.controller;


import com.kodilla.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private Player player;
    Move move = new Move();
    private GameMap map = new GameMap();
    private List<Enemy> enemyList = new ArrayList();
    private boolean endGame = false;

    public Game(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void moveUp() {
        player = move.moveUp(player, map.getMap());
    }

    public void moveDown() {
        player = move.moveDown(player, map.getMap());
    }

    public void moveLeft() {
        player = move.moveLeft(player, map.getMap());
    }

    public void moveRight() {
        player = move.moveRight(player, map.getMap());
    }

    public void addMageToEnemyList(int x, int y) {
        enemyList.add(new Mage(x, y, 4));
    }

    public void addWarriorToEnemyList(int x, int y) {
        enemyList.add(new Warrior(x, y, 4));
    }

    public int getMapIndex(int x, int y) {
        return map.getMapIndex(x, y);
    }

    public Enemy getEnemyFromEnemyList(int x, int y) {
        return enemyList.stream().filter(enemy -> enemy.getPositionX() == x).filter(enemy -> enemy.getPositionY() == y).findFirst().orElse(null);
    }

    public List<Enemy> getEnemyList() {
        return enemyList;
    }

    public boolean checkField() {
        if (map.getMapIndex(player.getPositionX(), player.getPositionY()) == 1) {
            map.setMapIndex(player.getPositionX(), player.getPositionY(), new Random().nextInt(4) + 1);

            switch (map.getMapIndex(player.getPositionX(), player.getPositionY())) {
                case 2:
                    addMageToEnemyList(player.getPositionX(), player.getPositionY());
                    return true;
                case 3:
                    addWarriorToEnemyList(player.getPositionX(), player.getPositionY());
                    return true;
            }
        }
        return false;
    }
}

