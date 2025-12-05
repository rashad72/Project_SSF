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
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/EquipmentManagerGoals/Goal4_RemoveOrDamageEquipment.fxml"));
            Scene Goal4Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(Goal4Scene);
            currentStage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("logInView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(scene);
            currentStage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void EquipmentHistoryButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/EquipmentManagerGoals/Goal3_ViewFullUsageHistory.fxml"));
            Scene Goal3Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(Goal3Scene);
            currentStage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void AvailableEquipmentButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/EquipmentManagerGoals/Goal5_GenarateReportAvailableEquipment.fxml"));
            Scene Goal5Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(Goal5Scene);
            currentStage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void UpdateEquipmentButtonOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/EquipmentManagerGoals/Goal2_UpdateEquipmentStatus.fxml"));
            Scene Goal2Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(Goal2Scene);
            currentStage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void GenerateMaintenanceReportButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/EquipmentManagerGoals/Goal8_GenarateMaintenanceShedulereport.fxml"));
            Scene Goal8Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(Goal8Scene);
            currentStage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void AlertCenterButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/EquipmentManagerGoals/Goal6_MonitorAllertLowStock.fxml"));
            Scene Goal6Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(Goal6Scene);
            currentStage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void MaintenanceScheduleButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/EquipmentManagerGoals/Goal7_SetOrUpdateNextMaintanenceDate.fxml"));
            Scene Goal7Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(Goal7Scene);
            currentStage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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