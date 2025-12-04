package com.example.simulation_ssf.Controller.FXMLControllerForUser4;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class OC_Goal4_ViewController
{
    @javafx.fxml.FXML
    private TextField proposalNoTF;
    @javafx.fxml.FXML
    private TableColumn missionTypeTableColumn;
    @javafx.fxml.FXML
    private TextField filterAddressTF;
    @javafx.fxml.FXML
    private TableColumn locationTableColumn;
    @javafx.fxml.FXML
    private ComboBox filterMissionTypeCB;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn situationTableColumn;
    @javafx.fxml.FXML
    private DatePicker assignDatePicker;
    @javafx.fxml.FXML
    private ComboBox decisionCB;
    @javafx.fxml.FXML
    private TextField commentTF;
    @javafx.fxml.FXML
    private TableColumn descriptionTableColumn;
    @javafx.fxml.FXML
    private TableView proposalTableView;
    @javafx.fxml.FXML
    private TableColumn proposalNoTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmButtonOnAction(ActionEvent actionEvent) {
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
    public void filterButtonOnAction(ActionEvent actionEvent) {
    }
}