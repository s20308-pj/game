package com.kodilla.view;

import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;


public class InfoPanel extends SubScene {

    private final String infoBackgroundURL = "file:src/main/resources/infoIMG.png";
    BackgroundImage backgroundImage = new BackgroundImage(
            new Image(infoBackgroundURL),
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, false)
    );
    GameButton fightButton = new GameButton("FIGHT");
    GameButton fleeButton = new GameButton("RUN");

    public InfoPanel() {
        super(new AnchorPane(), 500, 500);
        prefWidth(500);
        prefHeight(500);
        AnchorPane infoPanel = (AnchorPane) this.getRoot();
        infoPanel.setBackground(new Background(backgroundImage));
        fightButton.relocate(75,375);
        fleeButton.relocate(275, 375);

        infoPanel.getChildren().add(fightButton);
        infoPanel.getChildren().add(fleeButton);
    }
}
