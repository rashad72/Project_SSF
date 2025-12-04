package com.example.simulation_ssf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SSFApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD:Simulation_SSF/src/main/java/com/example/simulation_ssf/HelloApplication.java
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/logInView.fxml"));
        //Scene scene = new Scene(fxmlLoader.load());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("logInView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
=======
        FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("logInView.fxml"));
     //   FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/CommunicationOfficerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
     //   Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Simulation SSF");
        //stage.setTitle("Hello!");
>>>>>>> d23a171362ca59cc7abe756fe5005c9a512b2d95:Simulation_SSF/src/main/java/com/example/simulation_ssf/SSFApplication.java
        stage.setScene(scene);
        stage.show();
    }
}
