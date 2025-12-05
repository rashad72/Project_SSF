package com.example.simulation_ssf.Controller.FXMLControllerForUser6;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class IA_Goal1_Controller
{
    @javafx.fxml.FXML
    private TableColumn reportDateTC;
    @javafx.fxml.FXML
    private TableColumn reportIDTC;
    @javafx.fxml.FXML
    private ComboBox regionCB;
    @javafx.fxml.FXML
    private TableView viewandAnalyzeTV;
    @javafx.fxml.FXML
    private TableColumn PriorityTC;
    @javafx.fxml.FXML
    private DatePicker toDP;
    @javafx.fxml.FXML
    private ComboBox priorityCB;
    @javafx.fxml.FXML
    private TableColumn threatTypeTC;
    @javafx.fxml.FXML
    private TableColumn regionTC;
    @javafx.fxml.FXML
    private TextField reportIDTF;
    @javafx.fxml.FXML
    private Label outputL;
    @javafx.fxml.FXML
    private TableColumn sourceTC;
    @javafx.fxml.FXML
    private TableColumn summuryTC;
    @javafx.fxml.FXML
    private DatePicker fromDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void threatReportOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashBoardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/IntelligenceAnalyst.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(dashboardScene);
            currentStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}