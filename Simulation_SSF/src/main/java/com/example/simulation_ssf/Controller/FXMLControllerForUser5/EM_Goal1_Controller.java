package com.example.simulation_ssf.Controller.FXMLControllerForUser5;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.Equipment;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;


public class EM_Goal1_Controller
{
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private Label outputL;
    @javafx.fxml.FXML
    private TextField equipmentNameTF;
    @javafx.fxml.FXML
    private TextField quantityTF;
    private ArrayList<Equipment> equipmentList = new ArrayList<>();
    @javafx.fxml.FXML
    private TextField equipmentIDTF;

    @javafx.fxml.FXML
    public void initialize() {
        typeCB.getItems().addAll("Electronics", "Medical", "Weapon", "Communication", "Other");
        statusCB.getItems().addAll("Available", "Assigned", "Repair", "Damaged");
    }

    @javafx.fxml.FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
        // int equipmentID, String equipmentName, String type, int quantity,
        // String status, String assignedTeam, LocalDate lastMaintenanceDate,
        // int usageDuration, int assignedUnit, int minimumRequired,
        // LocalDate lastUpdated, LocalDate nextMaintenanceDate, String technician)
        Equipment equipment = new Equipment(Integer.parseInt(equipmentIDTF.getText()),
                equipmentNameTF.getText(),typeCB.getValue(),Integer.parseInt(quantityTF.getText()),
                statusCB.getValue(),null,null,
                00,00,00, null,
                null,"null");
        equipmentList.add(equipment);
        System.out.println(equipment);
        outputL.setText("Equipment added successfully");


    }

    @javafx.fxml.FXML
    public void dashBoardButtonOnAction(ActionEvent actionEvent) {
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