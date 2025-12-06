package com.example.simulation_ssf;

import com.example.simulation_ssf.User.FieldOperative;
import com.example.simulation_ssf.nonUser.AppendableObjectOutputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class SSFApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("logInView.fxml"));
        //   FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/CommunicationOfficerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        //   Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Simulation SSF");
        //stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
