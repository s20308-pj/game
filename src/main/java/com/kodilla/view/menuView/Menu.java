package com.kodilla.view.menuView;


import com.kodilla.model.Init;
import com.kodilla.view.template.ButtonTemplate;
import com.kodilla.view.template.LabelDescriptionScene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;



public class Menu extends AnchorPane {

    private ButtonTemplate startButton;
    private ButtonTemplate descriptionButton;
    private ButtonTemplate endButton;
    private GameDescriptionScene gameDescriptionScene;
    private String text = "Za górami, za lasami, za dolinami\n" +
            "Pobili się dwaj górale ciupagami\n" +
            "Hej górale, nie bijta się\n" +
            "Ma góralka dwa warkocze, podzielita się\n";

    public Menu() {
        setWidth(Init.PRIMARY_VIEW_WIDTH);
        setHeight(Init.PRIMARY_VIEW_HEIGHT);
        setBackground(Init.createBackground(Init.URL_MENU_BG));
        createMenuButtons();
        createImage();
        createGameDescriptionScene();
    }

    private void createImage() {
        ImageView image = new ImageView(Init.drawImage());
        image.relocate(Init.PRIMARY_VIEW_WIDTH / 2, Init.WIDTH);
        image.setPreserveRatio(true);
        image.setFitHeight(Init.WIDTH * 5);
        getChildren().add(image);
    }

    private void createMenuButtons() {
        startButton = new ButtonTemplate("START");
        descriptionButton = new ButtonTemplate("OPIS");
        endButton = new ButtonTemplate("ZAKONCZ");
        getChildren().add(startButton);
        getChildren().add(descriptionButton);
        getChildren().add(endButton);
        startButton.relocate(Init.PRIMARY_VIEW_WIDTH / 3 - Init.BUTTON_WIDTH / 2, Init.WIDTH);
        descriptionButton.relocate(Init.PRIMARY_VIEW_WIDTH / 3 - Init.BUTTON_WIDTH / 2, Init.WIDTH * 2.5);
        endButton.relocate(Init.PRIMARY_VIEW_WIDTH / 3 - Init.BUTTON_WIDTH / 2, Init.WIDTH * 4);
    }

    private void createGameDescriptionScene() {
        gameDescriptionScene = new GameDescriptionScene();
        LabelDescriptionScene label = new LabelDescriptionScene(text, gameDescriptionScene.getWidth(), gameDescriptionScene.getHeight(), 0, 0);
        getChildren().add(gameDescriptionScene);
        gameDescriptionScene.getPanel().getChildren().add(label);
    }


    public void setText(String text) {

    }

    public ButtonTemplate getStartButton() {
        return startButton;
    }

    public ButtonTemplate getDescriptionButton() {
        return descriptionButton;
    }

    public GameDescriptionScene getGameDescriptionScene() {
        return gameDescriptionScene;
    }

    public ButtonTemplate getEndButton() {
        return endButton;
    }
}
