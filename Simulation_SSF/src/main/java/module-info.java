module com.example.simulation_ssf {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulation_ssf to javafx.fxml;
    exports com.example.simulation_ssf;
}