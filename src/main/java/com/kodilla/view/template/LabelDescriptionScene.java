package com.kodilla.view.template;


import com.kodilla.model.Init;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class LabelDescriptionScene extends Label {

    public LabelDescriptionScene(String text) {
        setText(text);
        setFont(Init.TEXT_FONT);
        setAlignment(Pos.CENTER);
        setPadding(new Insets(20,20,20,20) );
        setWrapText(true);
    }
    public LabelDescriptionScene(String text, double width, double height, double x, double y){
        setText(text);
        setWidth(width);
        setHeight(height);
        relocate(x,y);

        setFont(Init.TEXT_FONT);
        setAlignment(Pos.CENTER);
        setPadding(new Insets(80,80,80,80) );
        setWrapText(true);
    }
}
