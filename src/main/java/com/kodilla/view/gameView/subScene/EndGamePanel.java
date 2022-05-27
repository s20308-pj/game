package com.kodilla.view.gameView.subScene;

import com.kodilla.model.Init;
import com.kodilla.model.Player;
import com.kodilla.view.template.ButtonTemplate;
import com.kodilla.view.template.LabelDescriptionScene;
import com.kodilla.view.template.SubSceneTemplate;
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.util.Duration;

public class EndGamePanel extends SubSceneTemplate {

    private ButtonTemplate okButton;
    private LabelDescriptionScene fightResultLabel;


    public EndGamePanel() {
        setWidth(Init.INFO_VIEW_WIDTH);
        setHeight(Init.INFO_VIEW_HEIGHT);
        getPanel().setBackground(Init.createBackground(Init.URL_INFO_BG));
        relocate(Init.WIDTH * 10, Init.HEIGHT);
        createButtons();
        createEndGameLabel();
    }

    private void createEndGameLabel() {
        fightResultLabel = new LabelDescriptionScene("");
        fightResultLabel.relocate(Init.WIDTH * 2, Init.HEIGHT * 2);
        fightResultLabel.setAlignment(Pos.CENTER);
        getPanel().getChildren().add(fightResultLabel);
        fightResultLabel.setFont(Init.BUTTON_FONT);
    }

    public void setEndText(Player player) {
        fightResultLabel.setText("Twoja przygoda dobiegla konca" +
                "\nS  tatystyki:" +
                "\nzycie - " + player.getLive() +
                "\nsila - " + player.getStrength() +
                "\nmagia - " + player.getMagicPower() +
                "\ndoswiadczeie - " + player.getExperience());
    }

    private void createButtons() {
        okButton = new ButtonTemplate("OK");
        okButton.relocate(getWidth() / 2 - 1.5 * Init.WIDTH, getHeight() - 2.5 * Init.HEIGHT);
        getPanel().getChildren().add(okButton);
    }

    @Override
    public void moveSceneToVisibility() {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.3));
        transition.setNode(this);
        transition.setToX(-Init.WIDTH * 9);
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
}
