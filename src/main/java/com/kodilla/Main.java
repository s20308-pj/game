package com.kodilla;


import com.kodilla.view.menuView.StartView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StartView view = new StartView();
        primaryStage = view.getMenuStage();

        primaryStage.show();
    }
}
