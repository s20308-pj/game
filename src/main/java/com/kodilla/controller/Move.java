package com.kodilla.controller;

import com.kodilla.model.Player;

public class Move {
    int point;

    public Player moveUp(Player player, int[][] mapValue) {
        point = mapValue[player.getPositionY() - 1][player.getPositionX()];
        if (player.getPositionY() > 1 && point != 0) {
            player.setPreviousPositionY(player.getPositionY());
            player.setPositionY(player.getPositionY() - 1);
        }
        return player;
    }

    public Player moveDown(Player player, int[][] mapValue) {
        point = mapValue[player.getPositionY() + 1][player.getPositionX()];
        if (player.getPositionY() < 10 && point != 0) {
            player.setPreviousPositionY(player.getPositionY());
            player.setPositionY(player.getPositionY() + 1);
        }
        return player;
    }

    public Player moveRight(Player player, int[][] mapValue) {
        point = mapValue[player.getPositionY()][player.getPositionX() + 1];
        if (player.getPositionX() < 10 && point != 0) {
            player.setPreviousPositionX(player.getPositionX());
            player.setPositionX(player.getPositionX() + 1);
        }
        return player;
    }

    public Player moveLeft(Player player, int[][] mapValue) {
        point = mapValue[player.getPositionY()][player.getPositionX() - 1];
        if (player.getPositionX() > 1 && point != 0) {
            player.setPreviousPositionX(player.getPositionX());
            player.setPositionX(player.getPositionX() - 1);
        }
        return player;
    }
}
