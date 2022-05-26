package com.kodilla.view.gameView.subScene;


import com.kodilla.model.Enemy;
import com.kodilla.model.Init;
import com.kodilla.model.Player;
import com.kodilla.view.template.ButtonTemplate;
import com.kodilla.view.template.LabelDescriptionScene;
import com.kodilla.view.template.SubSceneTemplate;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class MeetEnemyPanel extends SubSceneTemplate {
    private ButtonTemplate fightButton;
    private ButtonTemplate runButton;
    private LabelDescriptionScene playerLabel;
    private LabelDescriptionScene enemyLabel;

    public MeetEnemyPanel() {
        setWidth(Init.INFO_VIEW_WIDTH);
        setHeight(Init.INFO_VIEW_HEIGHT);
        getPanel().setBackground(Init.createBackground(Init.URL_INFO_BG));
        relocate(Init.WIDTH, -Init.HEIGHT * 10);
        createButtons();
        createLabel();
    }

    public ButtonTemplate getFightButton() {
        return fightButton;
    }

    public ButtonTemplate getRunButton() {
        return runButton;
    }

    @Override
    public void moveSceneToVisibility() {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.3));
        transition.setNode(this);
        transition.setToY(Init.HEIGHT * 11);
        transition.play();
    }

    public void moveSceneToHidden() {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.3));
        transition.setNode(this);
        transition.setToY(0);
        transition.play();
    }

    private void createButtons() {
        fightButton = new ButtonTemplate("WALCZ");
        runButton = new ButtonTemplate("UCIEKAJ");
        fightButton.relocate(1.5 * Init.WIDTH, getHeight() - 2.5 * Init.HEIGHT);
        runButton.relocate(getWidth() - 4.5 * Init.WIDTH, getHeight() - 2.5 * Init.HEIGHT);
        getPanel().getChildren().add(fightButton);
        getPanel().getChildren().add(runButton);
    }

    private void createLabel() {
        playerLabel = new LabelDescriptionScene("");
        enemyLabel = new LabelDescriptionScene("");
        playerLabel.relocate(Init.WIDTH*2, Init.HEIGHT*2);
        enemyLabel.relocate(getPanel().getWidth() / 2 , Init.HEIGHT*2);
        playerLabel.setFont(Init.BUTTON_FONT);
        enemyLabel.setFont(Init.BUTTON_FONT);
        getPanel().getChildren().add(playerLabel);
        getPanel().getChildren().add(enemyLabel);
    }

    public void setTextToLabel(Player player, Enemy enemy) {
        String playerText = player.getName()
                + "\nzycie:" + player.getLive()
                + "\nsila:" + player.getStrength()
                + "\nmagia:" + player.getMagicPower();
        String enemyText = enemy.getName()
                + "\nzycie:" + enemy.getLive()
                + "\nsila:" + enemy.getStrength()
                + "\nmagia:" + enemy.getMagicPower();
        playerLabel.setText(playerText);
        enemyLabel.setText(enemyText);
    }
}
