package com.kodilla.view;

import com.kodilla.model.Init;
import javafx.scene.SubScene;
import javafx.scene.layout.AnchorPane;

public class InfoPanel extends SubScene {
    AnchorPane infoPanel = (AnchorPane) this.getRoot();
    GameButton okButton = new GameButton("OK");
    public InfoPanel() {
        super(new AnchorPane(), Init.INFO_WINDOW_WIDTH - 2 * Init.WIDTH, Init.INFO_WINDOW_HEIGHT - 2 * Init.HEIGHT);
        prefWidth(Init.INFO_WINDOW_WIDTH- 2 * Init.WIDTH);
        prefHeight(Init.INFO_WINDOW_WIDTH- 2 * Init.HEIGHT);
        infoPanel.setBackground(Init.createBackground(Init.URL_INFO_BG));
        infoPanel.getChildren().add(okButton);
        okButton.relocate(infoPanel.getMaxWidth() - 170,infoPanel.getMaxHeight()-Init.WIDTH*2);
        relocate(3*Init.WIDTH, 3*Init.HEIGHT);
    }
}
