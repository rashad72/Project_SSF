module com.example.simulation_ssf {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 18f6109c5811d2de53900a6f93dae978ba4427a3
>>>>>>> 1cde0d8b3317bf548ea16b060cc7f1223c5f1db5


    opens com.example.simulation_ssf to javafx.fxml;
    // new add
    opens com.example.simulation_ssf.Controller to javafx.fxml;
    //new
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser1 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser2 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser3 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser4 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser5 to javafx.fxml;
    opens com.example.simulation_ssf.Controller.FXMLControllerForUser6 to javafx.fxml;
    exports com.example.simulation_ssf;
}