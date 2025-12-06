package com.example.simulation_ssf.Controller.FXMLControllerForUser2;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VD_Goal6_ViewController
{
    @javafx.fxml.FXML
    private TextField fulsOdometerTextField;
    @javafx.fxml.FXML
    private TableView fulsTableView;
    @javafx.fxml.FXML
    private ComboBox<String> fulsFuelStationComboBox;
    @javafx.fxml.FXML
    private TextField fulsVehicleIdTextField;
    @javafx.fxml.FXML
    private TextField fulsFuelAmountTextField;
    @javafx.fxml.FXML
    private DatePicker fulsRefuelDatePicker;
    @javafx.fxml.FXML
    private TextField fulsCostTextField;
    @javafx.fxml.FXML
    private DatePicker fulsFilterRefuelDatePicker1;
    @javafx.fxml.FXML
    private ComboBox<String> fulsFilterFuelStationComboBox1;

    @javafx.fxml.FXML
    public void initialize() {
        fulsFuelStationComboBox.getItems().addAll("Padma Fuel Station","Meghna Fuel Station" ,"Internal SSF Station" ,"City Fuel Hub" ,"Highway Fuel Depot");
        fulsFilterFuelStationComboBox1.getItems().addAll("Padma Fuel Station","Meghna Fuel Station" ,"Internal SSF Station" ,"City Fuel Hub" ,"Highway Fuel Depot");
    }

    @javafx.fxml.FXML
    public void fulsAddButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fulsFilterAddButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fulsToDashboardButtonOnAction(ActionEvent actionEvent) {
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