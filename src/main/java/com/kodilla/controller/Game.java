package com.kodilla.controller;

//import com.kodilla.model.Enemy.Enemy;
import com.kodilla.model.*;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Player player;
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

    public int[][] getMapValue(){
        return map.getMap();
    }

    public void addWarriorToEnemyList(int x, int y){

    }
}

