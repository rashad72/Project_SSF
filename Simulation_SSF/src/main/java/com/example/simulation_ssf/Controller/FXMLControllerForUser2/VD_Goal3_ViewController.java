package com.example.simulation_ssf.Controller.FXMLControllerForUser2;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.AppendableObjectOutputStream;
import com.example.simulation_ssf.nonUser.Vehicle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

public class VD_Goal3_ViewController
{
    @javafx.fxml.FXML
    private TextField eertNumberOfPeopleTextField;
    @javafx.fxml.FXML
    private TextField eertEvaquationLocationTextField;
    @javafx.fxml.FXML
    private TableView<Vehicle> eertTableView;
    @javafx.fxml.FXML
    private DatePicker eertEvaquationDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> eertEvaquationTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> eertEvaquationTypeFilterComboBox1;
    @javafx.fxml.FXML
    private DatePicker eertEvaquationDateFilterDatePicker1;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> etTC;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, LocalDate> edTC;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> elTC;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> nopTC;

    private ArrayList<Vehicle> eVlist = new ArrayList<Vehicle>();

    @javafx.fxml.FXML
    public void initialize() {
        eertEvaquationTypeFilterComboBox1.getItems().addAll("Medical","Fire","Rescue","Accident", "General Evacuation");
        eertEvaquationTypeComboBox.getItems().addAll("Medical","Fire","Rescue","Accident", "General Evacuation");
        etTC.setCellValueFactory(new PropertyValueFactory<>("type"));
        edTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        elTC.setCellValueFactory(new PropertyValueFactory<>("location"));
        nopTC.setCellValueFactory(new PropertyValueFactory<>("people"));

    }

    @javafx.fxml.FXML
    public void eertSubmitButtonOnAction(ActionEvent actionEvent) {
        try {
            File messageFile = new File("EmergencyVehicle.bin");
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
            oos.writeObject(eVlist);
            oos.close();
            System.out.println("Object saved");
        } catch (Exception e) {
            System.out.println("Not saved");
        }
    }

    @javafx.fxml.FXML
    public void eertShowInTableViewButtonOnAction(ActionEvent actionEvent) {
        //(String location, String people, String type, LocalDate date)
        Vehicle v = new Vehicle(eertEvaquationLocationTextField.getText(),eertNumberOfPeopleTextField.getText(),eertEvaquationTypeComboBox.getValue(),
                eertEvaquationDateDatePicker.getValue());
        eVlist.add(v);
        eertTableView.getItems().add(v);
    }

    @javafx.fxml.FXML
    public void eertFilterShowInTableViewButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void eertToDashboardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/VehicleDriver.fxml"));
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