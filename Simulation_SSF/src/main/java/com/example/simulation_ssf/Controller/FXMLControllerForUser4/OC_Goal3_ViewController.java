package com.example.simulation_ssf.Controller.FXMLControllerForUser4;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class OC_Goal3_ViewController
{
    @javafx.fxml.FXML
    private TextField operative2IdTF;
    @javafx.fxml.FXML
    private DatePicker validUntilDatePicker;
    @javafx.fxml.FXML
    private TextField teamCaptainIdTF;
    @javafx.fxml.FXML
    private TextField operative5IdTF;
    @javafx.fxml.FXML
    private TextField teamIdTF;
    @javafx.fxml.FXML
    private TextField operative1IdTF;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField teamNameTF;
    @javafx.fxml.FXML
    private TextField operative4IdTF;
    @javafx.fxml.FXML
    private TextField operative3IdTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/OperationCommanderDashboard.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(dashboardScene);
            currentStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void assignTeamButtonOnAction(ActionEvent actionEvent) {
    }
}