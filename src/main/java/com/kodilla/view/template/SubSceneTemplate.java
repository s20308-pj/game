package com.kodilla.view.template;

import com.kodilla.model.Init;
import javafx.scene.SubScene;
import javafx.scene.layout.AnchorPane;


public abstract class SubSceneTemplate extends SubScene {

    public SubSceneTemplate() {
        super(new AnchorPane(), Init.INFO_VIEW_WIDTH, Init.INFO_VIEW_HEIGHT);
        AnchorPane template = (AnchorPane) this.getRoot();
        template.setBackground(Init.createBackground(Init.URL_INFO_BG_5x3));
    }
    public AnchorPane getPanel(){
        return (AnchorPane) this.getRoot();
    }
    public abstract void moveSceneToVisibility();
}
