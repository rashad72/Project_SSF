package com.example.simulation_ssf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/CommunicationOfficerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
=======
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("logInView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
>>>>>>> 653b48620cf3410cfc42ec70df567b32350d191a
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
