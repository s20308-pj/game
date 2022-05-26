package com.kodilla.view.gameView;


import com.kodilla.controller.Game;
import com.kodilla.model.Enemy;
import com.kodilla.model.Init;
import com.kodilla.view.gameView.subScene.MeetEnemyPanel;
import com.kodilla.view.gameView.subScene.ShopTemplate;
import com.kodilla.view.template.SubSceneTemplate;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GameView {
    private Board board;
    private Scene gameScene;
    private Stage gameStage;
    private Stage menuStage;
    Game game = new Game();
    private SubSceneTemplate visibleSubScene;
    private MeetEnemyPanel meetEnemyPanel = new MeetEnemyPanel();
    private ShopTemplate cityPanel = new ShopTemplate(Init.URL_CITY, Init.CITY_TEXT);
    private ShopTemplate towerPanel = new ShopTemplate(Init.URL_TOWER, Init.TOWER_TEXT);
    private ShopTemplate templePanel = new ShopTemplate(Init.URL_TEMPLE, Init.TEMPLE_TEXT);

    public GameView() {
        board = new Board();
        gameScene = new Scene(board, Init.PRIMARY_VIEW_WIDTH, Init.PRIMARY_VIEW_HEIGHT, Color.BLACK);
        gameStage = new Stage();
        game.setNewGame();
        gameStage.setResizable(false);
        gameStage.setScene(gameScene);
        keyEvent();
    }


    private void keyEvent() {
        gameScene.setOnKeyPressed(event -> {
            int actionOnFiled;
            KeyCode pressedKey = event.getCode();
            if (visibleSubScene == null) {
                game.move(pressedKey);

                if (game.isFiledToDrawEnemy()) {
                    game.drawFiled();
                    board.getChildren().add(game.getEnemyFromEnemyList());
                }
                actionOnFiled = game.doActionOnFiled();

                switch (actionOnFiled) {
                    case 2:
                    case 3:
                        setMeetEnemyPanel();
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
                        setTemplePanel();
                        break;
                    case 8:
                        //chance to buy magicPower
                        setTowerPanel();
                        break;
                    case 9:
                        //chance to buy strength
                        setCityPanel();
                        break;
                }
            }
        });
    }

    private void setMeetEnemyPanel() {
        visibleSubScene = meetEnemyPanel;
        Enemy enemy = game.getEnemyFromEnemyList();
        board.getChildren().add(meetEnemyPanel);
        meetEnemyPanel.setTextToLabel(game.getPlayer(),enemy);
        meetEnemyPanel.moveSceneToVisibility();
        meetEnemyPanel.getRunButton().setOnAction(event -> {
            meetEnemyPanel.moveSceneToHidden();
            visibleSubScene = null;
            board.getChildren().remove(meetEnemyPanel);
        });

    }

    private void setCityPanel() {
        visibleSubScene = cityPanel;
        board.getChildren().add(cityPanel);
        cityPanel.moveSceneToVisibility();
        cityPanel.getBuyButton().setOnAction(event -> {
            if (game.buyStrength()) {
                cityPanel.setBuyResultOkText();
            } else cityPanel.setBuyResultFalseText();
        });
        cityPanel.getOkButton().setOnAction(buttonEvent -> {
            cityPanel.moveSceneToHidden();
            visibleSubScene = null;
            board.getChildren().remove(cityPanel);
        });
    }

    private void setTowerPanel() {
        visibleSubScene = towerPanel;
        board.getChildren().add(towerPanel);
        towerPanel.moveSceneToVisibility();
        towerPanel.getBuyButton().setOnAction(event -> {
            if (game.buyMagicPower()) {
                towerPanel.setBuyResultOkText();
            } else towerPanel.setBuyResultFalseText();
        });
        towerPanel.getOkButton().setOnAction(buttonEvent -> {
            towerPanel.moveSceneToHidden();
            visibleSubScene = null;
            board.getChildren().remove(towerPanel);
        });
    }

    private void setTemplePanel() {
        visibleSubScene = templePanel;
        board.getChildren().add(templePanel);
        templePanel.moveSceneToVisibility();
        templePanel.getBuyButton().setOnAction(event -> {
            if (game.buyLive()) {
                templePanel.setBuyResultOkText();
            } else templePanel.setBuyResultFalseText();
        });
        templePanel.getOkButton().setOnAction(buttonEvent -> {
            templePanel.moveSceneToHidden();
            visibleSubScene = null;
            board.getChildren().remove(templePanel);
        });
    }

    private void checkFiled() {

    }


    public void newGame(Stage menuStage) {
        this.menuStage = menuStage;
        menuStage.hide();
        game.setNewGame();
        board.getChildren().add(game.getPlayer());
        gameStage.show();
    }

}
