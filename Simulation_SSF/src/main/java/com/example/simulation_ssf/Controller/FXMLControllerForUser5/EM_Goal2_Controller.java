package com.example.simulation_ssf.Controller.FXMLControllerForUser5;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.Equipment;
import com.example.simulation_ssf.nonUser.Mission;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;

public class EM_Goal2_Controller
{
    @javafx.fxml.FXML
    private TableView<Equipment> updateEquipmentTV;
    @javafx.fxml.FXML
    private TableColumn<Equipment,String> typeTC;
    @javafx.fxml.FXML
    private TableColumn<Equipment,Integer> equipmentIDTC;
    @javafx.fxml.FXML
    private TableColumn<Equipment,String > statusTC;
    @javafx.fxml.FXML
    private TableColumn<Equipment,String > equimentNameTC;
    @javafx.fxml.FXML
    private Label outputL;
    @javafx.fxml.FXML
    private TableColumn<Equipment,Integer> quantityTC;
    @javafx.fxml.FXML
    private TextField equipmentIDTF;
    @javafx.fxml.FXML
    private ComboBox<String> statusBoxCB;
    private ArrayList<Equipment> equipmentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        //     public Equipment(int equipmentID, String equipmentName, String type,
        //     int quantity, String status, String assignedTeam,
        //     LocalDate lastMaintenanceDate, int usageDuration, int assignedUnit,
        //     int minimumRequired, LocalDate lastUpdated, LocalDate nextMaintenanceDate,
        //     String technician) {
        statusBoxCB.getItems().addAll("Available", "Unavailable","Damaged","Not Used","Under Maintenance");
        quantityTC.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        typeTC.setCellValueFactory(new PropertyValueFactory<>("type"));
        equipmentIDTC.setCellValueFactory(new PropertyValueFactory<>("equipmentID"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        equimentNameTC.setCellValueFactory(new PropertyValueFactory<>("equipmentName"));







    }

    @javafx.fxml.FXML
    public void updateButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashboardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/EquipmentManagerDashbord.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(dashboardScene);
            currentStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}