package org.example.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.example.App;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button btnRegistrer;
    @FXML
    private PasswordField cajaPass;
    @FXML
    private TextField cajaUser;

    @FXML
    public void metodoComprobar(Event e) throws IOException {
        System.out.println("aña");
        if (cajaUser.getText().equals("admin") && cajaPass.getText().equals("admin")){

            System.out.println("admin");
            App.setRoot("primary");
        }
    }
}
