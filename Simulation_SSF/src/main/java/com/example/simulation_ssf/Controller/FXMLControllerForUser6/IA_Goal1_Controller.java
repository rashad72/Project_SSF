package com.example.simulation_ssf.Controller.FXMLControllerForUser6;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.ThreatReport;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class IA_Goal1_Controller
{
    @javafx.fxml.FXML
    private TableColumn<ThreatReport,String> reportDateTC;
    @javafx.fxml.FXML
    private TableColumn<ThreatReport,Integer> reportIDTC;
    @javafx.fxml.FXML
    private ComboBox<String> regionCB;
    @javafx.fxml.FXML
    private TableView<ThreatReport> viewandAnalyzeTV;
    @javafx.fxml.FXML
    private TableColumn<ThreatReport,String> PriorityTC;
    @javafx.fxml.FXML
    private DatePicker toDP;
    @javafx.fxml.FXML
    private ComboBox<String> priorityCB;
    @javafx.fxml.FXML
    private TableColumn<ThreatReport,String> threatTypeTC;
    @javafx.fxml.FXML
    private TableColumn<ThreatReport,String> regionTC;
    @javafx.fxml.FXML
    private TextField reportIDTF;
    @javafx.fxml.FXML
    private Label outputL;
    @javafx.fxml.FXML
    private TableColumn<ThreatReport,String> sourceTC;
    @javafx.fxml.FXML
    private TableColumn<ThreatReport,String> summuryTC;
    @javafx.fxml.FXML
    private DatePicker fromDP;

    @javafx.fxml.FXML
    public void initialize() {
        regionCB.getItems().addAll("Dhaka","Chittagong","Sylhet","Rajshahi","Khulna","Rangpur");
        priorityCB.getItems().addAll("Low","Medium","High","Critical");
        reportDateTC.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
        PriorityTC.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
        threatTypeTC.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
        regionTC.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
        sourceTC.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
        summuryTC.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
        reportIDTC.setCellValueFactory(new PropertyValueFactory<>("reportID"));







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