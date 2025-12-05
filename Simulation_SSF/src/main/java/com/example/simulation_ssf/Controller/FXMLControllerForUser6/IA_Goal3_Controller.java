package com.example.simulation_ssf.Controller.FXMLControllerForUser6;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class IA_Goal3_Controller
{
    @javafx.fxml.FXML
    private TextField analysisTF;
    @javafx.fxml.FXML
    private ComboBox priorityTypeCB;
    @javafx.fxml.FXML
    private DatePicker toDP;
    @javafx.fxml.FXML
    private ComboBox missionTypeCB;
    @javafx.fxml.FXML
    private ComboBox regionTypeCB;
    @javafx.fxml.FXML
    private TextField reportedIDTF;
    @javafx.fxml.FXML
    private ComboBox threatLevelCB;
    @javafx.fxml.FXML
    private DatePicker fromDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashBoardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/IntelligenceAnalyst.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(dashboardScene);
            currentStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}