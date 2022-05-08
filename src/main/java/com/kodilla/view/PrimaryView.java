package com.kodilla.view;

import com.kodilla.controller.Game;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PrimaryView {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private Board board;
    private Scene mainScene;
    private Stage mainStage;

    public PrimaryView() {
        board = new Board();
        mainScene = new Scene(board, WIDTH, HEIGHT, Color.BLACK);
        mainStage = new Stage();
        mainStage.setTitle("GAME");
        mainStage.setResizable(false);
        mainStage.setScene(mainScene);
    }

    public Stage getMainStage(){
        return mainStage;
    }
    public Scene getMainScene(){
        return mainScene;
    }
    public Board getBoard(){
        return board;
    }
}
