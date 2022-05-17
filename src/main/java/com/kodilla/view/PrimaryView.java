package com.kodilla.view;

import com.kodilla.model.ButtonEvent;
import com.kodilla.model.Enemy;
import com.kodilla.model.Init;
import com.kodilla.model.Player;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PrimaryView {
    private Board board;
    private Scene mainScene;
    private Stage mainStage;

    ButtonEvent buttonEvent = ButtonEvent.WAIT;

    private FightPanel fightPanel = new FightPanel();

    public PrimaryView() {
        board = new Board();
        mainScene = new Scene(board, Init.MAIN_WINDOW_WIDTH, Init.MAIN_WINDOW_HEIGHT, Color.BLACK);
        mainStage = new Stage();
        mainStage.setTitle("GAME");
        mainStage.setResizable(false);
        mainStage.setScene(mainScene);
    }

    public Stage getMainStage() {
        return mainStage;
    }

    public Scene getMainScene() {
        return mainScene;
    }

    public Board getBoard() {
        return board;
    }

    private void addFightPanel() {
        board.getChildren().add(fightPanel);
    }

    public void removeFightPanel() {
        board.getChildren().remove(fightPanel);
    }

    public ButtonEvent setFightPanel(Player player, Enemy enemy) {
        addFightPanel();
        fightPanel.setDescription(player, enemy);
        fightPanel.movePanelToVisible();
        fightPanel.getFleeButton().setOnAction(event -> {
            fightPanel.movePanelToHidden();
            setButtonEventToRUN();
            player.changePositionToPreviousPosition();
            removeFightPanel();
        });
        fightPanel.getFightButton().setOnAction(event -> {
            fightPanel.movePanelToHidden();
            buttonEventToFIGHT();
            removeFightPanel();
        });
        return buttonEvent;
    }

    private void setButtonEventToRUN() {
        buttonEvent = ButtonEvent.RUN;
    }

    private void buttonEventToFIGHT() {
        buttonEvent = ButtonEvent.FIGHT;
    }

    public void setInfoPanel(boolean win) {

    }
}
