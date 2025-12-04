package com.example.simulation_ssf.Controller.FXMLControllerForUser3;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class CO_Goal7_ViewController
{
    @javafx.fxml.FXML
    private TableColumn alertIdTableColumn;
    @javafx.fxml.FXML
    private DatePicker alertDatePicker;
    @javafx.fxml.FXML
    private TableColumn messageTableColumn;
    @javafx.fxml.FXML
    private TableColumn priorityTableColumn;
    @javafx.fxml.FXML
    private TextField alertIdTF;
    @javafx.fxml.FXML
    private Label messageContentLabel;
    @javafx.fxml.FXML
    private TableView alertMessagesTableView;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn categoryTableColumn;
    @javafx.fxml.FXML
    private ComboBox priorityFilterCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void markMessageAsReadButtonOnAction(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {
    }
}