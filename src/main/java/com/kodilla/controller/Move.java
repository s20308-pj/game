package com.kodilla.controller;

import com.kodilla.model.Player;

public class Move {

    public Player moveUp(Player player) {
        if (player.getPositionY() > 1) {
            player.setPositionY(player.getPositionY() - 1);
            }
        return player;
    }

    public Player moveDown(Player player) {
        if (player.getPositionY() < 10) {
            player.setPositionY(player.getPositionY() + 1);
        }
        return player;
    }

    public Player moveRight(Player player) {
        if (player.getPositionX() < 10) {
            player.setPositionX(player.getPositionX() + 1);
        }
        return player;
    }

    public Player moveLeft(Player player) {
        if (player.getPositionX() > 1) {
            player.setPositionX(player.getPositionX() - 1);
        }
        return player;
    }
}
