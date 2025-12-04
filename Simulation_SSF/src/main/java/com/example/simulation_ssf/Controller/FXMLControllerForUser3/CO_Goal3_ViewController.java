package com.example.simulation_ssf.Controller.FXMLControllerForUser3;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CO_Goal3_ViewController
{
    @javafx.fxml.FXML
    private TableColumn teamCaptainIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn messageIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn missionIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn senderTableColumn;
    @javafx.fxml.FXML
    private TableColumn missionTypeTableColumn;
    @javafx.fxml.FXML
    private TextField messageIdTF;
    @javafx.fxml.FXML
    private TableView incomingMessagesTableView;
    @javafx.fxml.FXML
    private TableColumn subjectTableColumn;
    @javafx.fxml.FXML
    private TableColumn currentStatusTableColumn;
    @javafx.fxml.FXML
    private Label messageContentLabel;
    @javafx.fxml.FXML
    private Label senderNameLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void markMessageAsAcknowledgeButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewMessageButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/CommunicationOfficerDashboard.fxml"));
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
    public void refreshIncomingMessageButtonOnAction(ActionEvent actionEvent) {
    }
}