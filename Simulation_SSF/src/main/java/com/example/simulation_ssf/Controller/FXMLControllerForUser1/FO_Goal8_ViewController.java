package com.example.simulation_ssf.Controller.FXMLControllerForUser1;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FO_Goal8_ViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> cccCommandUnitComboBBox;
    @javafx.fxml.FXML
    private TextField cccMessageTitleTextField;
    @javafx.fxml.FXML
    private TextArea cccMessageBodyTextArea;
    @javafx.fxml.FXML
    private TableView cccTableView;
    @javafx.fxml.FXML
    private DatePicker cccDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        cccCommandUnitComboBBox.getItems().addAll("HQ Command","Local Command","Vehicle Unit","Communication Room","Emergency Unit","Quick Response Team");
    }

    @javafx.fxml.FXML
    public void cccSubmitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cccShowInTableViewButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cccToDashboardButtonOnAction(ActionEvent actionEvent) {
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