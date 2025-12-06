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

public class VD_Goal3_ViewController
{
    @javafx.fxml.FXML
    private TextField eertNumberOfPeopleTextField;
    @javafx.fxml.FXML
    private TextField eertEvaquationLocationTextField;
    @javafx.fxml.FXML
    private TableView eertTableView;
    @javafx.fxml.FXML
    private DatePicker eertEvaquationDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> eertEvaquationTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> eertEvaquationTypeFilterComboBox1;
    @javafx.fxml.FXML
    private DatePicker eertEvaquationDateFilterDatePicker1;

    @javafx.fxml.FXML
    public void initialize() {
        eertEvaquationTypeFilterComboBox1.getItems().addAll("Medical","Fire","Rescue","Accident", "General Evacuation");
        eertEvaquationTypeComboBox.getItems().addAll("Medical","Fire","Rescue","Accident", "General Evacuation");
    }

    @javafx.fxml.FXML
    public void eertSubmitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void eertShowInTableViewButtonOnAction(ActionEvent actionEvent) {
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