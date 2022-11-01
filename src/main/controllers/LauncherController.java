package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import main.MainApplication;

public class LauncherController {
    @FXML
    private Button StartButton;

    @FXML
    public void initialize() {
        StartButton.setOnAction(event -> {
            MainApplication.setSceneParent("Game");
            StartButton.setDisable(true);
        });
    }
}
