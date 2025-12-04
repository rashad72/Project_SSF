package com.example.simulation_ssf.Controller.FXMLControllerForUser3;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class CO_Goal6_ViewController
{
    @javafx.fxml.FXML
    private TableColumn operativeIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn nameTableColumn;
    @javafx.fxml.FXML
    private Label operativeNameLabel;
    @javafx.fxml.FXML
    private TableColumn currentStatusTableColumn;
    @javafx.fxml.FXML
    private ComboBox filterOperativeStatusCB;
    @javafx.fxml.FXML
    private ComboBox NewStatusCB;
    @javafx.fxml.FXML
    private TableColumn currentStatusTableColumn11;
    @javafx.fxml.FXML
    private TableView fieldOperationTableView;
    @javafx.fxml.FXML
    private TableColumn teamCaptainFlagTableColumn;
    @javafx.fxml.FXML
    private TextField operativeIdTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateStatusButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshOperationsButtonOnAction(ActionEvent actionEvent) {
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
    public void filterAndLoadButtonOnAction(ActionEvent actionEvent) {
    }
}