package com.kodilla;

import com.kodilla.controller.Game;
import com.kodilla.controller.Move;
import com.kodilla.model.Enemy;
import com.kodilla.model.Player;
import com.kodilla.view.GameButton;
import com.kodilla.view.InfoPanel;
import com.kodilla.view.PrimaryView;
import javafx.application.Application;
import javafx.scene.input.KeyCode;
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
        InfoPanel infoPanel = new InfoPanel();
        primaryStage = view.getMainStage();

        view.getMainScene().setOnKeyPressed(event -> {
                    KeyCode pressedKey = event.getCode();
                    game.move(pressedKey);

                    if (game.checkField()) {
//                        Enemy enemy = game.getEnemyFromEnemyList(player.getPositionX(), player.getPositionY());
                        view.getBoard().getChildren().add(game.getEnemyFromEnemyList(player.getPositionX(), player.getPositionY()));
                    }

                    // test infoPanel
//                    infoPanel.relocate(50,50);
//                    view.getBoard().getChildren().add(infoPanel);

                    // check map position and enemy list
                    System.out.println("x: " + player.getPositionX()
                            + ", y:" + player.getPositionY()
                            + ", index: " + game.getMapIndex(player.getPositionX(), player.getPositionY())
                            + " enemy: " + game.getEnemyFromEnemyList(player.getPositionX(), player.getPositionY()));
                    System.out.println(game.getEnemyList().toString());
                    System.out.println(view.getBoard().getChildren().toString());

                }
        );
        view.getBoard().getChildren().add(player);
        primaryStage.show();
    }
}
