module com.example.simulation_ssf {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.example.simulation_ssf;


    opens com.example.simulation_ssf to javafx.fxml;
    exports com.example.simulation_ssf;
}