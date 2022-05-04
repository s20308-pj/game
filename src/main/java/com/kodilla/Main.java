package com.kodilla;

import com.kodilla.controller.Game;
import com.kodilla.controller.Move;
import com.kodilla.model.Player;
import com.kodilla.view.Board;
import com.kodilla.view.PrimaryView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    Move move = new Move();
    private final Player player = new Player();
    Game game = new Game(player);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PrimaryView view = new PrimaryView();
        primaryStage = view.getMainStage();

        view.getMainScene().setOnKeyPressed(event -> {
                    KeyCode pressedKey = event.getCode();
                    switch (pressedKey) {
                        case UP:
                            game.setPlayer(move.moveUp(game.getPlayer(), game.getMapValue()));
                            break;

                        case DOWN:
                            game.setPlayer(move.moveDown(game.getPlayer(), game.getMapValue()));
                            break;

                        case LEFT:
                            game.setPlayer(move.moveLeft(game.getPlayer(), game.getMapValue()));
                            break;

                        case RIGHT:
                            game.setPlayer(move.moveRight(game.getPlayer(), game.getMapValue()));
                            break;
                    }

            player.changePosition(player.getPositionX(), player.getPositionY());

                }
        );
        view.getBoard().getChildren().add(player);
        primaryStage.show();
    }
}
