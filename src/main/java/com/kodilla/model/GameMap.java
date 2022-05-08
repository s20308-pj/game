package com.kodilla.model;

public class GameMap {

    private int[][] map = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 7, 1, 1, 1, 1, 1, 1, 1, 1, 8, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0},
            {0, 1, 5, 1, 0, 1, 1, 0, 1, 5, 1, 0},
            {0, 1, 0, 1, 0, 0, 6, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 9, 1, 1, 1, 1, 1, 1, 1, 1, 7, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public int getMapIndex(int x, int y){
        return map[y][x];
    }
    public int[][] getMap() {
        return map;
    }
    public void setMapIndex(int x, int y, int value){
        map[y][x] = value;
    }
}
