package com.kodilla;

import com.kodilla.controller.Game;
import com.kodilla.controller.Move;
import com.kodilla.model.Player;
import com.kodilla.view.model.Board;
import com.kodilla.view.model.Knight;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
    Move move = new Move();
    private Player player = new Player();
    Game game = new Game(player);
    Knight playerPawn = new Knight(game.getPlayer().getPositionX(), game.getPlayer().getPositionY());

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Board root = new Board();
        Scene scene = new Scene(root, 600, 600, Color.WHITE);

        scene.setOnKeyPressed(event -> {
                    KeyCode pressedKey = event.getCode();
                    switch (pressedKey) {
                        case UP:
                            game.setPlayer(move.moveUp(game.getPlayer(), game.getMapValue()));
                            draw(game.getPlayer());
                            break;

                        case DOWN:
                            game.setPlayer(move.moveDown(game.getPlayer(), game.getMapValue()));
                            draw(game.getPlayer());
                            break;

                        case LEFT:
                            game.setPlayer(move.moveLeft(game.getPlayer(), game.getMapValue()));
                            draw(game.getPlayer());
                            break;

                        case RIGHT:
                            game.setPlayer(move.moveRight(game.getPlayer(), game.getMapValue()));
                            draw(game.getPlayer());
                            break;
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
//        playerPawn.
        playerPawn.changePosition(player.getPositionX(), player.getPositionY());
    }
}
