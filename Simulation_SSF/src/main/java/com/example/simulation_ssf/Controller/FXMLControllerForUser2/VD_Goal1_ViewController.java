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

public class VD_Goal1_ViewController
{
    @javafx.fxml.FXML
    private TextField setsMssionIdTextField;
    @javafx.fxml.FXML
    private TextField setsDestinationTextField;
    @javafx.fxml.FXML
    private DatePicker setsTripDatePicker;
    @javafx.fxml.FXML
    private TextField setsPickUpLocationTextField;
    @javafx.fxml.FXML
    private TableView setsTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void setsSubmitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void setsFilterDataAndShowButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void setsToDashboardButtonOnAction(ActionEvent actionEvent) {
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