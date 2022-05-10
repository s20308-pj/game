package com.kodilla.view;

import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class GameButton extends Button {

    private final String buttonReleaseBackgroundURL = "file:src/main/resources/buttonRelease.png";
    private final String buttonPressedBackgroundURL = "file:src/main/resources/buttonPressed.png";

    private BackgroundImage buttonReleaseBackgroundImage = new BackgroundImage(
            new Image(buttonReleaseBackgroundURL),
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, false)
    );

    private BackgroundImage buttonPressedBackgroundImage = new BackgroundImage(
            new Image(buttonPressedBackgroundURL),
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, false)
    );

    public GameButton(String text) {
        setText(text);
        setFont(Font.font("Verdana", 23));
        setPrefHeight(50);
        setPrefWidth(140);
        setBackground(new Background(buttonReleaseBackgroundImage));
        initializeButtonListener();
    }

    private void setButtonPressedStyle() {
        setPrefHeight(50);
        setBackground(new Background(buttonPressedBackgroundImage));
        setLayoutY(getLayoutY() + 1);
    }

    private void setButtonReleasedStyle() {
        setPrefHeight(49);
        setBackground(new Background(buttonReleaseBackgroundImage));
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

