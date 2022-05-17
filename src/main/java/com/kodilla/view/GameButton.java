package com.kodilla.view;

import com.kodilla.model.Init;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;
import javafx.scene.text.Font;

public class GameButton extends Button {


    public GameButton(String text) {
        setText(text);
        setFont(Font.font("Comic Sans MS", 22));
        setPrefHeight(50);
        setPrefWidth(140);
        setBackground(Init.createBackground(Init.URL_BUTTON_RELEASED));
        initializeButtonListener();
    }

    private void setButtonPressedStyle() {
        setPrefHeight(50);
        setBackground(Init.createBackground(Init.URL_BUTTON_PRESSED));
        setLayoutY(getLayoutY() + 1);
    }

    private void setButtonReleasedStyle() {
        setPrefHeight(49);
        setBackground(Init.createBackground(Init.URL_BUTTON_RELEASED));
        setLayoutY(getLayoutY() - 1);
    }

    private void initializeButtonListener() {
        setOnMousePressed(mouseEvent -> {
            if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
                setButtonPressedStyle();
            }
        });

        setOnMouseReleased(mouseEvent -> {
            if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
                setButtonReleasedStyle();
            }
        });

        setOnMouseEntered(mouseEvent -> {
            setEffect(new DropShadow());
        });
        setOnMouseExited(mouseEvent ->{
            setEffect(null);
        });
    }
}

