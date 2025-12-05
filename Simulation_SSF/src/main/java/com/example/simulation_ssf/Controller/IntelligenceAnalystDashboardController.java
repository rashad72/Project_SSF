package com.example.simulation_ssf.Controller;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class IntelligenceAnalystDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SummarizeReportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void EditOrUpdateButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OperationAnalyticsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void IntelligenceFileToShareButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ThreatReportsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/IntelligenceAnalystGoals/Goal1_ViewAndAnalyzeIntelligenceReport.fxml"));
            Scene Goal1Scene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(Goal1Scene);
            currentStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void CreateSummaryButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/IntelligenceAnalystGoals/Goal2_Createstructuredintelligencesummary.fxml"));
            Scene Goal2Scene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(Goal2Scene);
            currentStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    }

    @javafx.fxml.FXML
    public void SuspiciousActivitiesButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void FieldReportsButtonOnAction(ActionEvent actionEvent) {
    }
}