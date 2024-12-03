module es.ieslosmontecillos.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.test to javafx.fxml;
    exports es.ieslosmontecillos.test;
}