package com.kodilla.view.template;


import com.kodilla.model.Init;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;

public class ButtonTemplate extends Button {


    public ButtonTemplate(String text) {
        setText(text);
        setAlignment(Pos.CENTER);
        setFont(Init.BUTTON_FONT);
        setPrefHeight(Init.BUTTON_HEIGHT);
        setPrefWidth(Init.BUTTON_WIDTH);
        setBackground(Init.createBackground(Init.URL_BUTTON_RELEASED));
        initializeButtonListener();
    }

    private void setButtonPressedStyle() {
        setPrefHeight(Init.BUTTON_HEIGHT);
        setBackground(Init.createBackground(Init.URL_BUTTON_PRESSED));
        setLayoutY(getLayoutY() + 2);
    }

    private void setButtonReleasedStyle() {
        setPrefHeight(Init.BUTTON_HEIGHT - 2);
        setBackground(Init.createBackground(Init.URL_BUTTON_RELEASED));
        setLayoutY(getLayoutY() - 2);
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
        setOnMouseExited(mouseEvent -> {
            setEffect(null);
        });
    }
}
