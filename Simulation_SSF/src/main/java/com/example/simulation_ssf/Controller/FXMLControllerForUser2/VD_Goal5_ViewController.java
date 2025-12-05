package com.example.simulation_ssf.Controller.FXMLControllerForUser2;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class VD_Goal5_ViewController
{
    @javafx.fxml.FXML
    private DatePicker cmcDatePicker;
    @javafx.fxml.FXML
    private TextArea cmcMessageBodyTextArea;
    @javafx.fxml.FXML
    private TableView cmcTableView;
    @javafx.fxml.FXML
    private TextField cmcMissionIdTextField;
    @javafx.fxml.FXML
    private TextField cmcEmployeeIdTextField;
    @javafx.fxml.FXML
    private TextField cmcMessageSubjectTextField;
    @javafx.fxml.FXML
    private ComboBox cmcMissionTypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void cmcSubmitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cmcToDashboardButtonOnAction(ActionEvent actionEvent) {
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
    public void cmcSendMessageButtonOnAction(ActionEvent actionEvent) {
    }
}