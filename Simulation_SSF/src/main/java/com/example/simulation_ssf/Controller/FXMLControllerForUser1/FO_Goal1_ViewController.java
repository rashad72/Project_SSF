package com.example.simulation_ssf.Controller.FXMLControllerForUser1;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FO_Goal1_ViewController
{
    @javafx.fxml.FXML
    private DatePicker oGSSPDatePicker;
    @javafx.fxml.FXML
    private TextField oGSSPmissionIDTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void oGSSPsurveillanceButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void oGSSPSubmitReportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void oGSSPStartPatrolButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void oGSSPtoDashboardButtonOnAction(ActionEvent actionEvent) {
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