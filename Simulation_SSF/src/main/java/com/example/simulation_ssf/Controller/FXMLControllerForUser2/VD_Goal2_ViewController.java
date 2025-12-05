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
    private ComboBox vpmrFilterTireConditionComboBox1;
    @javafx.fxml.FXML
    private DatePicker vpmrFilterLastDateServiceDatePicker1;
    @javafx.fxml.FXML
    private TableView vpmrTableView;
    @javafx.fxml.FXML
    private ComboBox vpmrTireConditionComboBox;
    @javafx.fxml.FXML
    private ComboBox vpmrBreakConditionComboBox;
    @javafx.fxml.FXML
    private ComboBox vpmrFilterBreakConditionComboBox1;
    @javafx.fxml.FXML
    private DatePicker vpmrLastDateServiceDatePicker;
    @javafx.fxml.FXML
    private TextField vpmrVehicleIdTextField;
    @javafx.fxml.FXML
    private ComboBox vpmrEngineStatusComboBox;
    @javafx.fxml.FXML
    private TextArea vpmrOtherConditionTextArea;
    @javafx.fxml.FXML
    private ComboBox vpmrFilterEngineStatusComboBox1;

    @javafx.fxml.FXML
    public void initialize() {
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