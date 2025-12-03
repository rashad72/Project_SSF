package com.example.simulation_ssf.Controller;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CommunicationOfficerDashboardController
{
    @javafx.fxml.FXML
    private Button dashboardButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void communicationRecordsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("Goal8_CommunicationRecordsView.fxml"));
            Scene Goal8Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(Goal8Scene);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @javafx.fxml.FXML
    public void communicationPanelButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader =new FXMLLoader(SSFApplication.class.getResource("Goal2_CommunicationPanelView.fxml"));
            Scene Goal2scene =new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(Goal2scene);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void verifyLogsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("Goal5_VerifyLogsView.fxml"));
            Scene Goal5Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(Goal5Scene);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notificationsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("Goal7_NotificationsView.fxml"));
            Scene Goal7Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(Goal7Scene);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void monitorFieldOperationsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("Goal1_MonitorOperationsView.fxml"));
            Scene Goal1Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage)dashboardButton.getScene().getWindow();
            //(Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(Goal1Scene);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void generateReportButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("Goal4_GenerateReportView.fxml"));
            Scene Goal4Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(Goal4Scene);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void incomingMessagesButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("Goal3_IncomingMessagesView.fxml"));
            Scene Goal3Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(Goal3Scene);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void officerAvailabilityButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/CommunicationOfficerGoals/Goal6_OfficerAvailabilityView.fxml"));
            //CommunicationOfficerGoals/Goal6_OfficerAvailabilityView.fxml"));
                                                                                    ///com/example/simulation_ssf/CommunicationOfficerGoals/
            Scene Goal6Scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(Goal6Scene);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}