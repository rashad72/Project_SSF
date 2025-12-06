package com.example.simulation_ssf.Controller.FXMLControllerForUser2;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class VD_Goal2_ViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> vpmrFilterTireConditionComboBox1;
    @javafx.fxml.FXML
    private DatePicker vpmrFilterLastDateServiceDatePicker1;
    @javafx.fxml.FXML
    private TableView vpmrTableView;
    @javafx.fxml.FXML
    private ComboBox<String> vpmrTireConditionComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> vpmrBreakConditionComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> vpmrFilterBreakConditionComboBox1;
    @javafx.fxml.FXML
    private DatePicker vpmrLastDateServiceDatePicker;
    @javafx.fxml.FXML
    private TextField vpmrVehicleIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> vpmrEngineStatusComboBox;
    @javafx.fxml.FXML
    private TextArea vpmrOtherConditionTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> vpmrFilterEngineStatusComboBox1;

    @javafx.fxml.FXML
    public void initialize() {
        vpmrTireConditionComboBox.getItems().addAll("New","Good","Worn Out","Need Replace Soon", "Damaged");
        vpmrBreakConditionComboBox.getItems().addAll("Good","Average","Needs Repair", "Poor");
        vpmrEngineStatusComboBox.getItems().addAll("Good","Average", "Poor","Critical");
        vpmrFilterTireConditionComboBox1.getItems().addAll("New","Good","Worn Out","Need Replace Soon", "Damaged");
        vpmrFilterBreakConditionComboBox1.getItems().addAll("Good","Average","Needs Repair", "Poor");
        vpmrFilterEngineStatusComboBox1.getItems().addAll("Good","Average", "Poor","Critical");


    }

    @javafx.fxml.FXML
    public void vpmrToDashboardButtonOnAction(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void vpmrSubmitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void vpmrSubmitWithFilterAndShowTableButtonOnAction1(ActionEvent actionEvent) {

    }
}