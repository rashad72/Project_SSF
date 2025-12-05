package com.example.simulation_ssf.Controller.FXMLControllerForUser2;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VD_Goal8_ViewController
{
    @javafx.fxml.FXML
    private DatePicker dvusDatePicker;
    @javafx.fxml.FXML
    private TextField dvusVehicleIdTextField;
    @javafx.fxml.FXML
    private TableView dvusTableView;
    @javafx.fxml.FXML
    private TextField dvusEndTimeTextField;
    @javafx.fxml.FXML
    private TextField dvusStartTimeTextField;
    @javafx.fxml.FXML
    private TextField dvusOdometerStartTextField;
    @javafx.fxml.FXML
    private TextField dvusOdometerEndTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void dvusTotalDistanceButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dvusAddInTableButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dvusTotalTimeButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dvusToDashboardButtonOnAction(ActionEvent actionEvent) {
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