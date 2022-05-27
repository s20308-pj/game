package com.kodilla.view.menuView;


import com.kodilla.model.Init;
import com.kodilla.view.gameView.GameView;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StartView {

    private final Scene menuScene;
    private final Stage menuStage;
    private final Menu menu;

    public StartView() {
        menu = new Menu();
        menuScene = new Scene(menu, Init.PRIMARY_VIEW_WIDTH, Init.PRIMARY_VIEW_HEIGHT, Color.WHITE);
        menuStage = new Stage();
        menuStage.setTitle("GAME");
        menuStage.setResizable(false);
        menuStage.setScene(menuScene);
        menuButtonEvents();
    }

    private void menuButtonEvents() {
        menu.getStartButton().setOnAction(event -> {
            GameView gameView = new GameView();
            gameView.newGame(menuStage);
        });
        menu.getDescriptionButton().setOnAction(event -> {
            menu.getGameDescriptionScene().moveSceneToVisibility();
        });
        menu.getEndButton().setOnAction(event -> menuStage.close());
    }

    public Stage getMenuStage() {
        return menuStage;
    }
}
