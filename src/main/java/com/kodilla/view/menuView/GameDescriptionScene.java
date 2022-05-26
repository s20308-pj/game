package com.kodilla.view.menuView;


import com.kodilla.model.Init;
import com.kodilla.view.template.SubSceneTemplate;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class GameDescriptionScene extends SubSceneTemplate {

    private boolean isHidden = true;

    public GameDescriptionScene() {
        setWidth(10 * Init.WIDTH);
        setHeight(6 * Init.HEIGHT);
        relocate(Init.WIDTH, Init.HEIGHT * 12);
    }

    public void moveSceneToVisibility() {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.3));
        transition.setNode(this);
        if (isHidden) {
            isHidden = false;
            transition.setToY(-Init.HEIGHT * 7);
        } else {
            isHidden = true;
            transition.setToY(0);
        }
        transition.play();
    }
}
