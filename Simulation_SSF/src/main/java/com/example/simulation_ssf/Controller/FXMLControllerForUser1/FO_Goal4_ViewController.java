package com.example.simulation_ssf.Controller.FXMLControllerForUser1;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FO_Goal4_ViewController
{
    @javafx.fxml.FXML
    private TextField podrDurationTextField;
    @javafx.fxml.FXML
    private TextArea podrChallengesTextArea;
    @javafx.fxml.FXML
    private TableView podrTableView;
    @javafx.fxml.FXML
    private TextArea podrOperationSummaryTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void podrSubmitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void podrMissionIdTextField(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void podrTableLoadButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void podrToDashboardButtonOnAction(ActionEvent actionEvent) {
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