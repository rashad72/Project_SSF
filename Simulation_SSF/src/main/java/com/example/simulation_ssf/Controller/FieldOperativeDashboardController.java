package com.example.simulation_ssf.Controller;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FieldOperativeDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void coordinatewithCommunicationandCommandUnitsButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/FieldOperativeGoals/Goal8_CommunicationAndCommandCoordinationView.fxml"));
            Scene Goal8Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(Goal8Scene);
            currentStage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void riskAssessmentandAreaReconnaissanceButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onGroundSecurityandSurveillanceButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/FieldOperativeGoals/Goal1_OnGroundSecurityAndSurveillanceView.fxml"));
            Scene GoalScene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            //Stage currentStage = (Stage)dashboardButton.getScene().getWindow();
            currentStage.setScene(GoalScene);

            currentStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void fieldIntelligenceCollectionandReportingButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void emergencyResponseandCrisisHandlingButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void executeVIPProtectionProtocolsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void postOperationDebriefandReportingButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void maintainAndUpdateFieldEquipmentButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fooLogOutButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("logInView.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(dashboardScene);
            currentStage.show();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}