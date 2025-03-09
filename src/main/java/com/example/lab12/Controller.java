package com.example.lab12;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label resultLabel;

    @FXML
    private TextField operandField1;

    @FXML
    private TextField operandField2;

    @FXML
    private Button clearButton;

    @FXML
    private Button addButton;

    @FXML
    protected void initialize() {
        clearButton.setOnAction(event -> clearFields());
    }

    @FXML
    private void calculate() {
        try {
            int operand1 = Integer.parseInt(operandField1.getText());
            int operand2 = Integer.parseInt(operandField2.getText());
            int result = operand1 + operand2;

            resultLabel.setText(Integer.toString(result));
        } catch (NumberFormatException e) {
            resultLabel.setText("Error");
        }
    }
    @FXML
    private void clearFields() {
        operandField1.clear();
        operandField2.clear();
        resultLabel.setText("");
    }
}