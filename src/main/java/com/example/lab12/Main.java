package com.example.lab12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private TextField operandField1;
    private TextField operandField2;
    private Label resultLabel;

    @Override
    public void start(Stage stage) throws IOException {
        GridPane myGrid = new GridPane();
        Scene myScene = new Scene(myGrid, 400, 300);

        stage.setScene(myScene);
        stage.show();

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Lab12.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 300);
        stage.setTitle("MegaCalc!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}