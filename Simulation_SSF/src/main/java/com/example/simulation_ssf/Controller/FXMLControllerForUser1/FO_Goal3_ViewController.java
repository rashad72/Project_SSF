package com.example.simulation_ssf.Controller.FXMLControllerForUser1;

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

public class FO_Goal3_ViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> mufeComboBox;
    @javafx.fxml.FXML
    private TableView mufeTableView;
    @javafx.fxml.FXML
    private TextField mufeEquipementIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> mufeStatusComboBox;
    @javafx.fxml.FXML
    private DatePicker mufeLastMaintenanceDP;

    @javafx.fxml.FXML
    public void initialize() {
        mufeComboBox.getItems().addAll("Weapon","Handheld Camera", "Flashlight", "GPS Device", "First Aid Kit", "Protective Vest","Tactical Gear");
        mufeStatusComboBox.getItems().addAll("Working", "Need Maintainance", "Damaged", "Replaced");
    }

    @javafx.fxml.FXML
    public void mufeSubmitStatusButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void mufeTableViewButtonOnAction(ActionEvent actionEvent) {
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