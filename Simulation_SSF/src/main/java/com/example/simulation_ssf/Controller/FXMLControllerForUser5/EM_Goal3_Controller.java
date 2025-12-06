package com.example.simulation_ssf.Controller.FXMLControllerForUser5;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.Equipment;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;

public class EM_Goal3_Controller
{
    @javafx.fxml.FXML
    private TableView<Equipment> viewUsagehistoryTV;
    @javafx.fxml.FXML
    private DatePicker toDP;
    @javafx.fxml.FXML
    private TextField assignedUnitTF;
    @javafx.fxml.FXML
    private ComboBox<String> categoryCB;
    @javafx.fxml.FXML
    private DatePicker lastmaintenancedatePicker;
    @javafx.fxml.FXML
    private TableColumn<Equipment, LocalDate> lastMaintenancedateTC;
    @javafx.fxml.FXML
    private TextField searchTF;
    @javafx.fxml.FXML
    private DatePicker fromDP;
    @javafx.fxml.FXML
    private TableColumn<Equipment,Integer> usageDurationTC;
    @javafx.fxml.FXML
    private TableColumn<Equipment,String> typeTC;
    @javafx.fxml.FXML
    private TableColumn<Equipment,Integer> equipmentIDTC;
    @javafx.fxml.FXML
    private TableColumn<Equipment,String> equipmentNameFieldTC;
    private ArrayList<Equipment> equipmentList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        categoryCB.getItems().addAll("Weapon", "Gear", "Vehicle", "Communication");
        lastMaintenancedateTC.setCellValueFactory(new PropertyValueFactory<>("lastMaintenancedate"));
        usageDurationTC.setCellValueFactory(new PropertyValueFactory<>("usageDuration"));
        typeTC.setCellValueFactory(new PropertyValueFactory<>("type"));
        equipmentIDTC.setCellValueFactory(new PropertyValueFactory<>("equipmentID"));
        equipmentNameFieldTC.setCellValueFactory(new PropertyValueFactory<>("equipmentNameField"));



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