package com.kodilla.view.gameView;


import com.kodilla.model.Init;
import javafx.scene.layout.AnchorPane;

public class Board extends AnchorPane {
    public Board() {
        setWidth(Init.PRIMARY_VIEW_WIDTH);
        setHeight(Init.PRIMARY_VIEW_HEIGHT);
        relocate(0,0);
        setBackground(Init.createBackground( Init.URL_MAP_BG));
    }
}
