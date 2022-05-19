package com.kodilla.view;

import com.kodilla.model.Enemy;
import com.kodilla.model.Init;
import com.kodilla.model.Pawn;
import com.kodilla.model.Player;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.util.Duration;


public class FightPanel extends SubScene {
    private GameButton fightButton = new GameButton("WALCZ");
    private GameButton fleeButton = new GameButton("UCIEKAJ");
    AnchorPane fightPanel = (AnchorPane) this.getRoot();
    HBox hBox = new HBox();
    Label labelPlayer = new Label();
    Label labelEnemy = new Label();

    public FightPanel() {
        super(new AnchorPane(), Init.INFO_WINDOW_WIDTH, Init.INFO_WINDOW_WIDTH);
        prefWidth(Init.INFO_WINDOW_WIDTH);
        prefHeight(Init.INFO_WINDOW_WIDTH);
        fightPanel.setBackground(Init.createBackground(Init.URL_INFO_BG));
        fightButton.relocate(75, 375);
        fleeButton.relocate(275, 375);
        fightPanel.getChildren().add(fightButton);
        fightPanel.getChildren().add(fleeButton);
        addDescriptionToFightPanel();
        relocate(Init.WIDTH, -Init.INFO_WINDOW_WIDTH);
    }

    public void movePanelToVisible() {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.5));
        transition.setNode(this);
        transition.setToY(Init.INFO_WINDOW_HEIGHT + Init.HEIGHT);
        transition.play();
    }

    public void movePanelToHidden() {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.5));
        transition.setNode(this);
        transition.setToY(0);
        transition.play();
    }

    public GameButton getFleeButton() {
        return fleeButton;
    }

    public GameButton getFightButton() {
        return fightButton;
    }

    private HBox pawnDescription() {
        hBox.setSpacing(20);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(addPlayerLabel());
        hBox.getChildren().add(addEnemyLabel());
        hBox.setLayoutX(50);
        hBox.setLayoutY(100);
        return hBox;
    }

    private Label addPlayerLabel() {
        return getLabel();
    }

    private Label addEnemyLabel() {
        return getLabel();
    }
    public void setDescription(Player player, Enemy enemy){
        labelPlayer.setText(getText(player));
        labelEnemy.setText(getText(enemy));
    }

    private Label getLabel() {
        Label label = new Label();
        label.setPrefHeight(200);
        label.setPrefWidth(200);
        label.setPadding(new Insets(20, 20, 20, 20));
        label.setFont(Font.font("Helvetica", 20));
        label.setAlignment(Pos.CENTER);
        return label;
    }

    private String getText(Pawn pawn) {
        StringBuilder labelText = new StringBuilder();
        labelText.append(pawn.getName() + "\n");
        labelText.append("live: " + pawn.getLive() + "\n");
        labelText.append("Sila: " + pawn.getStrength() + "\n");
        labelText.append("Magia: " + pawn.getMagicPower());
        return labelText.toString();
    }

    public void addDescriptionToFightPanel() {
        fightPanel.getChildren().add(pawnDescription());
    }
}
