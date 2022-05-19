package com.kodilla;

import com.kodilla.controller.Fight;
import com.kodilla.controller.Game;
import com.kodilla.controller.Move;
import com.kodilla.model.ButtonEvent;
import com.kodilla.model.Enemy;
import com.kodilla.model.Player;
import com.kodilla.view.PrimaryView;
import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.beans.EventHandler;

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
                    int actionOnFiled;
                    KeyCode pressedKey = event.getCode();
                    game.move(pressedKey);

                    if (game.isFiledToDrawEnemy(player.getPositionX(), player.getPositionY())) {
                        game.drawFiled();
                        view.getBoard().getChildren().add(game.getEnemyFromEnemyList(player.getPositionX(), player.getPositionY()));
                    }
                    actionOnFiled = game.doActionOnFiled(player.getPositionX(), player.getPositionY());
                    switch (actionOnFiled) {
                        case 2:
                        case 3:
                            meetEnemy(view);
                            break;
                        case 5:
                            // view fightPanel
                            // fight bridgeGuard or back
                            break;
                        case 6:
                            // view fightPanel
                            // fight bossGuard or back
                            break;
                        case 7:
                            //chance to buy live
                            break;
                        case 8:
                            //chance to buy magicPower
                            break;
                        case 9:
                            //chance to buy strength
                            break;
                    }

                    // check map position and enemy list
                    System.out.println(" x: " + player.getPositionX()
                            + " , y:" + player.getPositionY()
                            + "\npx: " + player.getPreviousPositionX()
                            + ", py: " + player.getPreviousPositionY()
                            + ", index: " + game.getMapIndex(player.getPositionX(), player.getPositionY())
                            + " enemy: " + game.getEnemyFromEnemyList(player.getPositionX(), player.getPositionY()));
                    System.out.println(game.getEnemyList().toString());
                    System.out.println(view.getBoard().getChildren().toString());

                }
        );
        view.getBoard().getChildren().add(player);
        primaryStage.show();
    }

    private void meetEnemy(PrimaryView view) {
        System.out.println("in meetEnemy");
        Player player = game.getPlayer();
        Enemy enemy = game.getEnemyFromEnemyList(player.getPositionX(), player.getPositionY());
        Fight fight = new Fight();
        ButtonEvent event = view.setFightPanel(player, enemy);
        System.out.println("test");
        switch (event) {
            case RUN:
                System.out.println("RUN");
                break;
            case FIGHT:
                boolean win = fight.fight(player, enemy);
                view.setInfoPanel(win);

                if (enemy.getLive() == 0) {
                    game.removeEnemyFormEnemyList(enemy, player.getPreviousPositionX(), player.getPositionY());
                    view.getBoard().getChildren().remove(enemy);
                }
                break;
        }
    }

}
