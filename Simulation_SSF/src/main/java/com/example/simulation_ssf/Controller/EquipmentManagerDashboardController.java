package com.example.simulation_ssf.Controller;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EquipmentManagerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RemoveEquipmentButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void EquipmentHistoryButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AvailableEquipmentButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UpdateEquipmentButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void GenerateMaintenanceReportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AlertCenterButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void MaintenanceScheduleButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AddEquipmentButtonOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/EquipmentManagerGoals/Goal1_AddNewEquipment.fxml"));
            Scene Goal1Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(Goal1Scene);
            currentStage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }