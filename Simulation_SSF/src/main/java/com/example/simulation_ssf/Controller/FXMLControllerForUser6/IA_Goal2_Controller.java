package com.example.simulation_ssf.Controller.FXMLControllerForUser6;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class IA_Goal2_Controller
{
    @javafx.fxml.FXML
    private TableView createIntelliegenceSummuryTV;
    @javafx.fxml.FXML
    private TextField analysisTF;
    @javafx.fxml.FXML
    private TextField caseIDTF;
    @javafx.fxml.FXML
    private TableColumn priorityTC;
    @javafx.fxml.FXML
    private TableColumn caseIDTC;
    @javafx.fxml.FXML
    private ComboBox regionCB;
    @javafx.fxml.FXML
    private TableColumn reportedByTC;
    @javafx.fxml.FXML
    private TableColumn caseTitleTC;
    @javafx.fxml.FXML
    private ComboBox priorityCB;
    @javafx.fxml.FXML
    private TextField recommendationTF;
    @javafx.fxml.FXML
    private TableColumn threatTypeTC;
    @javafx.fxml.FXML
    private TableColumn regionTC;
    @javafx.fxml.FXML
    private TableColumn reportedDateTC;
    @javafx.fxml.FXML
    private TextField riskLevelsTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createSummuryOnAction(ActionEvent actionEvent) {
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