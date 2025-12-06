package com.example.simulation_ssf.Controller.FXMLControllerForUser5;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.AppendableObjectOutputStream;
import com.example.simulation_ssf.nonUser.Equipment;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.BreakIterator;
import java.time.LocalDate;
import java.util.ArrayList;

public class EM_Goal8_Controller {

    @FXML
    private TextField assignedUnitTF;
    @FXML
    private ComboBox<String> statusCB;
    @FXML
    private TextField equipmentNameTF;
    @FXML
    private DatePicker lastUpdatedDP;
    @FXML
    private DatePicker nextMaintenanceDP;
    @FXML
    private TextField assignedTeamTF;
    @FXML
    private TextField technicianTF;
    @FXML
    private DatePicker lastMaintenanceDP;
    @FXML
    private ComboBox<String> typeCB;
    @FXML
    private TextField minimumRequiredTF;
    @FXML
    private TextField equipmentIDTF;
    @FXML
    private TextField quantityTF;
    @FXML
    private TextField usageDurationTF;
    private ArrayList<Equipment> equipmentList = new ArrayList<>();


    @FXML
    public void initialize() {
        typeCB.getItems().addAll("Mechanical", "Electrical", "Software");
        statusCB.getItems().addAll("Available", "In Use", "Under Maintenance");
    }

    @Deprecated
    public void genarateReportOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void dashBoardButtonOnAction(ActionEvent actionEvent) {
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

    @FXML
    public void cancelButtonOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void saveButtonOnAction(ActionEvent actionEvent) {
        // Read and validate integer fields
        int equipmentID = Integer.parseInt(equipmentIDTF.getText());
        int quantity = Integer.parseInt(quantityTF.getText());
        int usageDuration = Integer.parseInt(usageDurationTF.getText());
        int assignedUnit = Integer.parseInt(assignedUnitTF.getText());
        int minimumRequired = Integer.parseInt(minimumRequiredTF.getText());

        String equipmentName = equipmentNameTF.getText();
        String type = typeCB.getValue();
        String status = statusCB.getValue();
        String assignedTeam = assignedTeamTF.getText();
        String technician = technicianTF.getText();

        LocalDate lastMaintenance = lastMaintenanceDP.getValue();
        LocalDate lastUpdated = lastUpdatedDP.getValue();
        LocalDate nextMaintenance = nextMaintenanceDP.getValue();

        // Basic validation
        if (equipmentName.isEmpty() || type == null || status == null) {
            System.out.println("Please fill all required fields");
            return;
        }

        //public Equipment(int equipmentID, String equipmentName, String type,
        // int quantity, String status, String assignedTeam, LocalDate lastMaintenanceDate,
        // int usageDuration, int assignedUnit, int minimumRequired, LocalDate lastUpdated,
        // LocalDate nextMaintenanceDate, String technician) {

        // Equipment eq = new Equipment(Integer.parseInt(equipmentIDTF.getText()),)
        Equipment e = new Equipment(Integer.parseInt(equipmentIDTF.getText()),
                equipmentNameTF.getText(), null, 00, statusCB.getValue(),
                assignedTeamTF.getText(), lastMaintenanceDP.getValue(),
                Integer.parseInt(usageDurationTF.getText()),
                Integer.parseInt(assignedUnitTF.getText()),
                Integer.parseInt(minimumRequiredTF.getText()),
                lastUpdatedDP.getValue(), nextMaintenanceDP.getValue(),
                technicianTF.getText()
        );
        equipmentList.add(e);
        System.out.println(equipmentList);

        try {
            File file  = new File("Equipment.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            if (file.exists()){
                fos = new FileOutputStream(file, true);

                oos = new AppendableObjectOutputStream(fos);
                System.out.println("appendable");
            }
            else {
                fos = new FileOutputStream(file);
                System.out.println("new");
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(e);
            oos.close();
            System.out.println("Object saved");
        } catch (Exception e1) {
            System.out.println("Not saved");;
        }

    }
}