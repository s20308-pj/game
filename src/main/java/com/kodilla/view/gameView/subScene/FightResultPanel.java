package com.kodilla.view.gameView.subScene;

import com.kodilla.model.Init;
import com.kodilla.model.Player;
import com.kodilla.view.template.ButtonTemplate;
import com.kodilla.view.template.LabelDescriptionScene;
import com.kodilla.view.template.SubSceneTemplate;
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.util.Duration;

public class FightResultPanel extends SubSceneTemplate {

    private ButtonTemplate okButton;
    private LabelDescriptionScene fightResultLabel;

    public FightResultPanel() {
        setWidth(Init.INFO_VIEW_WIDTH);
        setHeight(Init.INFO_VIEW_HEIGHT);
        getPanel().setBackground(Init.createBackground(Init.URL_INFO_BG));
        relocate(Init.WIDTH, Init.HEIGHT * 10);
        createButtons();
        createFightResultLabel();
    }

    private void createFightResultLabel() {
        fightResultLabel = new LabelDescriptionScene("");
        fightResultLabel.relocate(Init.WIDTH * 2, Init.HEIGHT * 2);
        fightResultLabel.setAlignment(Pos.CENTER);
        getPanel().getChildren().add(fightResultLabel);
        fightResultLabel.setFont(Init.BUTTON_FONT);
    }

    public void setDrawText(Player player) {
        String winDraw = "\tRemis\n" + statistic(player);
        fightResultLabel.setText(winDraw);
    }

    public void setWinText(Player player) {
        String winText = "\tZwyciestwo\n" + statistic(player);
        fightResultLabel.setText(winText);
    }

    public void setLostText(Player player) {
        String lostText = "\tPrzegrana\n" + statistic(player);
        fightResultLabel.setText(lostText);
    }

    private String statistic(Player player) {
        return "Twoje statystyki:\n"+
                "\nzycie - " + player.getLive() +
                "\nsila - " + player.getStrength() +
                "\nmagia - " + player.getMagicPower() +
                "\ndoswiadczeie - " + player.getExperience();
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
        transition.setToY(-Init.HEIGHT * 9);
        transition.play();
    }

    public void moveSceneToHidden() {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.3));
        transition.setNode(this);
        transition.setToY(0);
        transition.play();
    }

    public ButtonTemplate getOkButton() {
        return okButton;
    }
}
