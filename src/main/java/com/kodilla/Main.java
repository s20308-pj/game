package com.kodilla;

import com.kodilla.controller.Move;
import com.kodilla.model.Player;
import com.kodilla.view.model.Board;
import com.kodilla.view.model.Knight;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    private boolean endGame = false;
    Move move = new Move();
    private Player player = new Player();
    Knight playerPawn = new Knight(player.getPositionX(), player.getPositionY());

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Board root = new Board();
        Scene scene = new Scene(root, 600, 600, Color.BLACK);
        scene.setOnKeyPressed(
                new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                KeyCode pressedKey = event.getCode();
                switch (pressedKey) {
                    case UP: {
                        player = move.moveUp(player);
                        draw(player);
                        break;
                    }
                    case DOWN: {
                        player = move.moveDown(player);
                        draw(player);
                        break;
                    }
                    case LEFT: {
                        player = move.moveLeft(player);
                        draw(player);
                        break;
                    }
                    case RIGHT: {
                        player = move.moveRight(player);
                        draw(player);
                        break;
                    }
                }
            }
        }
        );
        root.getChildren().add(playerPawn);

        primaryStage.setTitle("Game");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void draw(Player player) {
        playerPawn.changePosition(player.getPositionX(), player.getPositionY());
    }
}
