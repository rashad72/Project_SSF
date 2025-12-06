package com.example.simulation_ssf.Controller.FXMLControllerForUser5;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.summaryReport;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class EM_Goal5_Controller {
    @javafx.fxml.FXML
    private TableView<summaryReport> summaryReportTableView;
    @javafx.fxml.FXML
    private TableColumn<summaryReport, String> receivedTableColumn;
    @javafx.fxml.FXML
    private DatePicker exportStartDatePicker;
    @javafx.fxml.FXML
    private DatePicker exportEndDatePicker;
    @javafx.fxml.FXML
    private TableColumn<summaryReport, Integer> failedTableColumn;
    @javafx.fxml.FXML
    private Label exportStatusLabel;
    @javafx.fxml.FXML
    private TableColumn<summaryReport, Integer> sentTableColumn;
    @javafx.fxml.FXML
    private TableColumn<summaryReport, Integer> pendingTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeCB;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeCB.getItems().addAll("Available Equipment", "All Equipment", "Low Stock");
        sentTableColumn.setCellValueFactory(new PropertyValueFactory<>("sent"));
        receivedTableColumn.setCellValueFactory(new PropertyValueFactory<>("received"));
        pendingTableColumn.setCellValueFactory(new PropertyValueFactory<>("pending"));
        failedTableColumn.setCellValueFactory(new PropertyValueFactory<>("failed"));

    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/EquipmentManagerDashbord.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
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
        String type = (String) reportTypeCB.getValue();

        if (type == null) {
            exportStatusLabel.setText("Please select a report type.");
            return;
        }
    }
}