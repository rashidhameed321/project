package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println("Hello, World!");
        System.out.println("Hello, buton clicked!");


        //welcomeText.setText("Welcome to JavaFX Application!");
    }
}