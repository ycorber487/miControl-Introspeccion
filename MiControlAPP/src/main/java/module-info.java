module es.ieslosmontecillos.micontrolapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.micontrolapp to javafx.fxml;
    exports es.ieslosmontecillos.micontrolapp;
}