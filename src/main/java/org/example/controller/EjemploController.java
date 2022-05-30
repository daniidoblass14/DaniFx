package org.example.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.EventListener;

public class EjemploController {

    @FXML
    private Button boton1;


    @FXML
    public void metodoHolaMundo (Event event1){

        System.out.println("HOLA MUNDO JFX");
    }
}
