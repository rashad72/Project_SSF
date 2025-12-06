package com.example.simulation_ssf.Controller.FXMLControllerForUser4;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.Message;
import com.example.simulation_ssf.nonUser.Mission;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class OC_Goal6_ViewController
{
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
    private TextField commentTF;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> addressTableColumn;
    @javafx.fxml.FXML
    private TextField missionIdTF;
    @javafx.fxml.FXML
    private TextField filterMissionIdTF;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> currentStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Mission, LocalDate> assignDateTableColumn;
    @javafx.fxml.FXML
    private DatePicker actionDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> actionCB;
    private ArrayList<Mission> missionList= new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<Mission, Integer> teamIdTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        filterMissionStatusCB.getItems().addAll("Ongoing", "Completed", "Cancelled", "Postponed");
        actionCB.getItems().addAll("Cancelled", "Postponed");

        teamIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("assignTeamId"));
        assignDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("assignDate"));
        currentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        addressTableColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        missionIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("missionId"));
        missionNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("missionName"));
        objectiveTableColumn.setCellValueFactory(new PropertyValueFactory<>("objective"));


        File file = new File("Mission.bin");
        if (!file.exists()) {
            System.out.println("File not found, returning empty list.");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                try {
                    Mission m1 = (Mission) ois.readObject();
                    missionList.add(m1);
                } catch (EOFException e) {
                    System.out.println("Bin file read!");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        ArrayList<Mission> tempList = new ArrayList<>();
        for (Mission m : missionList) {
            if (m.getStatus().equals("Ongoing")) {
                tempList.add(m);
            }


            fieldOperationTableView.getItems().addAll(tempList);
        }

    }







    @javafx.fxml.FXML
    public void refreshOperationsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void applyButtonOnAction(ActionEvent actionEvent) {
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