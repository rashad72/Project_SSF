module com.example.simulation_ssf {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
<<<<<<< HEAD
    requires com.example.simulation_ssf;

=======


>>>>>>> 70428da1bbe5915297396574784b38997ec1ef2f
    opens com.example.simulation_ssf to javafx.fxml;
    // new add
    opens com.example.simulation_ssf.Controller to javafx.fxml;
    opens com.example.simulation_ssf.nonUser to javafx.base;
    opens com.example.simulation_ssf.User to javafx.base;
    //new
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser1 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser2 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser3 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser4 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser5 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser6 to javafx.fxml;
    exports com.example.simulation_ssf;
}