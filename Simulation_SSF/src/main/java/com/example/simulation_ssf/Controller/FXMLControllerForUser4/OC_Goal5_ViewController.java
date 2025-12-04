package com.example.simulation_ssf.Controller.FXMLControllerForUser4;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class OC_Goal5_ViewController
{
    @javafx.fxml.FXML
    private TableColumn teamCaptainIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn objectiveTableColumn;
    @javafx.fxml.FXML
    private TableColumn missionNameTableColumn;
    @javafx.fxml.FXML
    private TableView fieldOperationTableView;
    @javafx.fxml.FXML
    private ComboBox filterMissionStatusCB;
    @javafx.fxml.FXML
    private DatePicker filterFromDatePicker;
    @javafx.fxml.FXML
    private TableColumn missionIdTableColumn;
    @javafx.fxml.FXML
    private TextField commentTF;
    @javafx.fxml.FXML
    private TableColumn addressTableColumn;
    @javafx.fxml.FXML
    private TextField missionIdTF;
    @javafx.fxml.FXML
    private TextField filterMissionIdTF;
    @javafx.fxml.FXML
    private DatePicker completionDatePicker;
    @javafx.fxml.FXML
    private TableColumn currentStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn assignDateTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void refreshOperationsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/OperationCommanderDashboard.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(dashboardScene);
            currentStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void markAsCompletedButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterAndLoadButtonOnAction(ActionEvent actionEvent) {
    }
}