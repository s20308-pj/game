package com.kodilla.controller;

import com.kodilla.model.GameMap;
import com.kodilla.model.Player;

public class Game {

    Player player;
    Move move = new Move();
    GameMap map = new GameMap();
    private int mapValue;
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
}

