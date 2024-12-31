package es.ieslosmontecillos.micontrolapp;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class MiControlController {
    @FXML
    private MiControl miControl;

    @FXML
    private void handleEvent(MouseEvent event) {
        System.out.println("MiControl fue clickeado!");
    }
}