module com.example.simulation_ssf {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.simulation_ssf to javafx.fxml;
    opens com.example.simulation_ssf.Controller to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser3 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser4 to javafx.fxml;
    opens com.example.simulation_ssf.User to javafx.fxml;
    opens com.example.simulation_ssf.nonUser to javafx.fxml;

    exports com.example.simulation_ssf;
}