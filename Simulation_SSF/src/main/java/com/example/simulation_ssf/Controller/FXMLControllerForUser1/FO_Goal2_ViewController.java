package com.example.simulation_ssf.Controller.FXMLControllerForUser1;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FO_Goal2_ViewController
{
    @javafx.fxml.FXML
    private TextField fICRthreatTypeTextField;
    @javafx.fxml.FXML
    private TextField fICRLocationTextField;
    @javafx.fxml.FXML
    private TableView fICRTableView;
    @javafx.fxml.FXML
    private TextField fICRSuspectInfoTextField;
    @javafx.fxml.FXML
    private TextArea fICRThreatDescriptionTextField;
    @javafx.fxml.FXML
    private ComboBox fICRSeverityLevelComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void fICRSubmitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fICRuploadEVandShowTableButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fICRtoDashboardButtonOnAction(ActionEvent actionEvent) {
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