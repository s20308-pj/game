package com.kodilla.view.gameView.subScene;


import com.kodilla.model.Init;
import com.kodilla.view.template.ButtonTemplate;
import com.kodilla.view.template.LabelDescriptionScene;
import com.kodilla.view.template.SubSceneTemplate;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class ShopTemplate extends SubSceneTemplate {
    private ButtonTemplate okButton;
    private ButtonTemplate buyButton;
    private LabelDescriptionScene description;
    private LabelDescriptionScene buyResult;

    public ShopTemplate(String imageUrl, String text) {
        setWidth(10 * Init.WIDTH);
        setHeight(8 * Init.HEIGHT);
        relocate(-10 * Init.WIDTH, Init.HEIGHT);
        createImage(imageUrl);
        createShopButton();
        setDescription(text);
        createBuyResult();
    }


    private void createImage(String ImageUrl) {
        ImageView image = new ImageView(ImageUrl);
        image.relocate(getPanel().getWidth() / 2 + Init.WIDTH / 2, Init.HEIGHT * 2);
        image.setPreserveRatio(true);
        image.setFitHeight(getPanel().getHeight() / 2 - Init.HEIGHT);
        image.setFitWidth(getPanel().getWidth() / 2 - Init.WIDTH);
        getPanel().getChildren().add(image);
    }

    private void createShopButton() {
        okButton = new ButtonTemplate("OK");
        buyButton = new ButtonTemplate("KUP");
        okButton.relocate(1.5 * Init.WIDTH, getHeight() - 2.5 * Init.HEIGHT);
        buyButton.relocate(getWidth() - 4.5 * Init.WIDTH, getHeight() - 2.5 * Init.HEIGHT);
        getPanel().getChildren().add(okButton);
        getPanel().getChildren().add(buyButton);
    }

    @Override
    public void moveSceneToVisibility() {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.3));
        transition.setNode(this);
        transition.setToX(Init.HEIGHT * 11);
        transition.play();
    }

    public void moveSceneToHidden() {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.3));
        transition.setNode(this);
        transition.setToX(0);
        transition.play();
    }

    public ButtonTemplate getOkButton() {
        return okButton;
    }

    public ButtonTemplate getBuyButton() {
        return buyButton;
    }

    private void setDescription(String text) {
        description = new LabelDescriptionScene(text);
        description.relocate(Init.WIDTH * 1.5, Init.HEIGHT * 2);
        getPanel().getChildren().add(description);
    }

    private void createBuyResult() {
        buyResult = new LabelDescriptionScene("");
        buyResult.relocate(Init.WIDTH * 1.5, Init.HEIGHT * 4.5);
        getPanel().getChildren().add(buyResult);
    }

    public void setBuyResultOkText() {
        String text = "Zakup udany";
        buyResult.setText(text);
    }

    public void setBuyResultFalseText() {
        String text = "Za malo doswiadczenia";
        buyResult.setText(text);
    }
}
