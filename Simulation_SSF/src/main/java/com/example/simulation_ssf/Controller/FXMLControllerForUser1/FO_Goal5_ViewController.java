package com.example.simulation_ssf.Controller.FXMLControllerForUser1;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FO_Goal5_ViewController
{
    @javafx.fxml.FXML
    private TableView erchTableView;
    @javafx.fxml.FXML
    private DatePicker erchEventDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> erchEergencyTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> erchResponseLevelComboBox;
    @javafx.fxml.FXML
    private TextField erchLocationTextField;
    @javafx.fxml.FXML
    private TextArea erchCricisDetailsTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        erchEergencyTypeComboBox.getItems().addAll("Medical","Accident","Fire","Crowd Panic");
        erchResponseLevelComboBox.getItems().addAll("Immediate", "High", "Medium", "Low");
    }

    @javafx.fxml.FXML
    public void erchShowInTableViewButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void erchActionTakenButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void erchToDashboardButtonOnAction(ActionEvent actionEvent) {
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