package com.example.simulation_ssf.Controller.FXMLControllerForUser2;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class VD_Goal7_ViewController
{
    @javafx.fxml.FXML
    private TextField iarLocationTextField;
    @javafx.fxml.FXML
    private ComboBox iarIncidentTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker iarDatePicker;
    @javafx.fxml.FXML
    private TableView iarTableView;
    @javafx.fxml.FXML
    private TextArea iarDescriptionTextArea;
    @javafx.fxml.FXML
    private ComboBox iarFilterIncidentTypeComboBox1;
    @javafx.fxml.FXML
    private DatePicker iarFilterDatePicker1;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void iarSubmitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void iarFilterSubmitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void iarToDashboardButtonOnAction(ActionEvent actionEvent) {
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