package com.example.simulation_ssf.Controller.FXMLControllerForUser1;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.AppendableObjectOutputStream;
import com.example.simulation_ssf.nonUser.Equipment;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class FO_Goal3_ViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> mufeComboBox;
    @javafx.fxml.FXML
    private TableView<Equipment> mufeTableView;
    @javafx.fxml.FXML
    private TextField mufeEquipementIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> mufeStatusComboBox;
    @javafx.fxml.FXML
    private DatePicker mufeLastMaintenanceDP;
    @javafx.fxml.FXML
    private TableColumn<Equipment, Integer> eqIdTC;
    @javafx.fxml.FXML
    private TableColumn<Equipment, LocalDate>lmTC;
    @javafx.fxml.FXML
    private TableColumn<Equipment, String> eqTC;
    @javafx.fxml.FXML
    private TableColumn<Equipment,String> statusTC;

    private ArrayList<Equipment> eqList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        mufeComboBox.getItems().addAll("Weapon","Handheld Camera", "Flashlight", "GPS Device", "First Aid Kit", "Protective Vest","Tactical Gear");
        mufeStatusComboBox.getItems().addAll("Working", "Need Maintainance", "Damaged", "Replaced");
        eqIdTC.setCellValueFactory(new PropertyValueFactory<>("equipmentID"));
        eqTC.setCellValueFactory(new PropertyValueFactory<>("equipmentName"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        lmTC.setCellValueFactory(new PropertyValueFactory<>("lastMaintenanceDate"));
    }

    @javafx.fxml.FXML
    public void mufeSubmitStatusButtonOnAction(ActionEvent actionEvent) {
        try {
            File messageFile = new File("FileOperativeEquipment.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            if (messageFile.exists()){
                fos = new FileOutputStream(messageFile, true);
                oos = new AppendableObjectOutputStream(fos);
                System.out.println("appendable");
            }
            else {
                fos = new FileOutputStream(messageFile);
                System.out.println("new");
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(eqList);
            oos.close();
            System.out.println("Object saved");
        } catch (Exception e) {
            System.out.println("Not saved");
        }
        eqList.clear();
        mufeTableView.getItems().clear();
    }

    @javafx.fxml.FXML
    public void mufeTableViewButtonOnAction(ActionEvent actionEvent) {
        //int equipmentID, String equipmentName, String type, int quantity, String status, String assignedTeam, LocalDate lastMaintenanceDate, int usageDuration, int assignedUnit, int minimumRequired, LocalDate lastUpdated, LocalDate nextMaintenanceDate, String technician)
        Equipment e = new Equipment(Integer.parseInt(mufeEquipementIdTextField.getText()),mufeComboBox.getValue(),null,00,mufeStatusComboBox.getValue(),null,mufeLastMaintenanceDP.getValue(),00,00,00,null,null,null);
        eqList.add(e);
        mufeTableView.getItems().add(e);
    }

    @javafx.fxml.FXML
    public void mufeToDashboardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/FieldOperative.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(dashboardScene);
            currentStage.show();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}