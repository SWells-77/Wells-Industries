package com.example.helloworldjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello World!");
    }

    @FXML
    protected void onHelloThereButtonClick() {
        welcomeText.setText("General Kenobi");
    }
}