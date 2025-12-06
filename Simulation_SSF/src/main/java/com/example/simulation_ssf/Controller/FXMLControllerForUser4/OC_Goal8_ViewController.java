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

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class OC_Goal8_ViewController
{
    @javafx.fxml.FXML
    private TableColumn<Mission, String> missionNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> teamIdTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> filterMissionStatusCB;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> statusTableColumn;
    @javafx.fxml.FXML
    private DatePicker filterFromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Mission, Integer> missionIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> addressTableColumn;
    @javafx.fxml.FXML
    private TextField missionIdTF;
    @javafx.fxml.FXML
    private TextField backupTeamIdTF;
    @javafx.fxml.FXML
    private TextField filterMissionIdTF;
    @javafx.fxml.FXML
    private TableView<Mission> ongoingMissionTableView;
    @javafx.fxml.FXML
    private TextField descriptionUpdateTF;
    @javafx.fxml.FXML
    private TableColumn<Mission, LocalDate> assignDateTableColumn;
    private ArrayList<Mission> missionList= new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        filterMissionStatusCB.getItems().addAll("Ongoing", "Completed", "Cancelled", "Postponed");


        teamIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("assignTeamId"));

        assignDateTableColumn.setCellValueFactory(new  PropertyValueFactory<>("actionDate"));
        addressTableColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        missionIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("missionId"));
        missionNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("missionName"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("objective"));



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
            ongoingMissionTableView.getItems().addAll(tempList);
        }
    }

    @javafx.fxml.FXML
    public void refreshOperationsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmButtonOnAction(ActionEvent actionEvent) {
        if (missionIdTF.getText().isEmpty()) {
            errorAlert("Please enter a Mission ID.");

            System.out.println("Please enter a Mission ID.");
            return;
        }
        int target = Integer.parseInt(missionIdTF.getText());
        for (Mission m2: missionList) {
            if (m2.getMissionId() == target){
            m2.setHasBackup(true);
            }
        }

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
//    private void writeMissionsToFile(ArrayList<Mission> list) {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Mission.Bi))) {
//            oos.writeObject(list);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public void errorAlert(String a ){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText(a);
        alert.showAndWait();
    }
}