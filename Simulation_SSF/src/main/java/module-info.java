module com.example.simulation_ssf {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
<<<<<<< HEAD
=======

>>>>>>> 6c1eb72a3bb9fb730587945db5c0dd1b2d166b28
    opens com.example.simulation_ssf to javafx.fxml;
    // new add
    opens com.example.simulation_ssf.Controller to javafx.fxml;
    opens com.example.simulation_ssf.nonUser to javafx.base;
    //new
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser1 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser2 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser3 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser4 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser5 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser6 to javafx.fxml;
    exports com.example.simulation_ssf;
}