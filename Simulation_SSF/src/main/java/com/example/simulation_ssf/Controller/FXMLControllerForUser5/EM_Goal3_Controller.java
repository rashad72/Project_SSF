package com.example.simulation_ssf.Controller.FXMLControllerForUser5;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class EM_Goal3_Controller
{
    @javafx.fxml.FXML
    private TableView viewUsagehistoryTV;
    @javafx.fxml.FXML
    private DatePicker toDP;
    @javafx.fxml.FXML
    private TextField assignedUnitTF;
    @javafx.fxml.FXML
    private TableColumn assignedUnitTC;
    @javafx.fxml.FXML
    private TableColumn searchTextFieldTC;
    @javafx.fxml.FXML
    private TableColumn categoryComboTC;
    @javafx.fxml.FXML
    private ComboBox categoryCB;
    @javafx.fxml.FXML
    private DatePicker lastmaintenancedatePicker;
    @javafx.fxml.FXML
    private TableColumn lastMaintenancedateTC;
    @javafx.fxml.FXML
    private TextField searchTF;
    @javafx.fxml.FXML
    private DatePicker fromDP;
    @javafx.fxml.FXML
    private TableColumn usageDurationTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateHistoryButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashBoardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/EquipmentManagerDashbord.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(dashboardScene);
            currentStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}