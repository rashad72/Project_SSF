package com.example.simulation_ssf.Controller.FXMLControllerForUser4;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.Mission;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;

public class OC_Goal1_ViewController
{
    @javafx.fxml.FXML
    private TableColumn<Mission, Long> teamCaptainIdTableColumn;
    @javafx.fxml.FXML
    private TextField filterAddressTF;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> objectiveTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> missionNameTableColumn;
    @javafx.fxml.FXML
    private TableView<Mission> fieldOperationTableView;
    @javafx.fxml.FXML
    private ComboBox<String> filterMissionStatusCB;
    @javafx.fxml.FXML
    private DatePicker filterFromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Mission, Integer> missionIdTableColumn;
    @javafx.fxml.FXML
    private TextField messageTF;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> addressTableColumn;
    @javafx.fxml.FXML
    private TextField missionIdTF;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> currentStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Mission, LocalDate> assignDateTableColumn;
    private ArrayList<Mission> missionList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {



    }

    @javafx.fxml.FXML
    public void sendMessageButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshOperationsButtonOnAction(ActionEvent actionEvent) {
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
    public void filterAndLoadButtonOnAction(ActionEvent actionEvent) {
    }
}