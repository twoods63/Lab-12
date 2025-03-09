package com.example.lab12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calc extends Application {
    @Override
    public void start(Stage myStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Lab12.fxml"));

        myStage.setTitle("MegaCalc!");
        myStage.setScene(new Scene(root, 400, 300));
        myStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
