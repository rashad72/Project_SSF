package com.example.simulation_ssf.Controller.FXMLControllerForUser3;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class CO_Goal4_ViewController
{
    @javafx.fxml.FXML
    private TableView summaryReportTableView;
    @javafx.fxml.FXML
    private TableColumn receivedTableColumn;
    @javafx.fxml.FXML
    private DatePicker exportStartDatePicker;
    @javafx.fxml.FXML
    private DatePicker exportEndDatePicker;
    @javafx.fxml.FXML
    private TableColumn failedTableColumn;
    @javafx.fxml.FXML
    private Label exportStatusLabel;
    @javafx.fxml.FXML
    private TableColumn sentTableColumn;
    @javafx.fxml.FXML
    private TableColumn pendingTableColumn;
    @javafx.fxml.FXML
    private ComboBox reportTypeCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/CommunicationOfficerDashboard.fxml"));
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
    public void exportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportButtonOnAction(ActionEvent actionEvent) {
    }
}