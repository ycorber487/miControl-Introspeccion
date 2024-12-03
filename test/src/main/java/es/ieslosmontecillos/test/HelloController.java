package es.ieslosmontecillos.test;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private MiControl miControl;

    @FXML
    private void handleMiControlAction(MouseEvent event) {
        System.out.println("MiControl fue clickeado!");
    }
}