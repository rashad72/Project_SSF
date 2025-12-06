package com.example.simulation_ssf.Controller.FXMLControllerForUser3;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.User.FieldOperative;
import com.example.simulation_ssf.nonUser.AppendableObjectOutputStream;
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

public class CO_Goal6_ViewController
{
    @javafx.fxml.FXML
    private TableColumn<FieldOperative, Long> operativeIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<FieldOperative, String> nameTableColumn;
    @javafx.fxml.FXML
    private Label operativeNameLabel;
    @javafx.fxml.FXML
    private TableColumn<FieldOperative, String> currentStatusTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> filterOperativeStatusCB;
    @javafx.fxml.FXML
    private ComboBox<String> NewStatusCB;
    @javafx.fxml.FXML
    private TableView<FieldOperative> fieldOperationTableView;
    @javafx.fxml.FXML
    private TableColumn<FieldOperative, Boolean> teamCaptainFlagTableColumn;
    @javafx.fxml.FXML
    private TextField operativeIdTF;
    private ArrayList<FieldOperative> operativeList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<FieldOperative, String> presentAddressTableColumn;


    @javafx.fxml.FXML
    public void initialize() {
        NewStatusCB.getItems().addAll("Available", "Busy", "Offline");
        filterOperativeStatusCB.getItems().addAll("Available", "Busy", "Offline");
        //  public FieldOperative(long nID, long phoneNo, String name, String mailAddress
        //  , long employeeId, LocalDate joinDate, String presentAddress, boolean isCaptain, boolean inMission
        //  , int currentMissionId, String availabilityStatus) {

        operativeIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        currentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("availabilityStatus"));
        teamCaptainFlagTableColumn.setCellValueFactory(new PropertyValueFactory<>("isCaptain"));
        presentAddressTableColumn.setCellValueFactory(new PropertyValueFactory<>("presentAddress"));

//        FieldOperative f = FieldOperative





        File file = new File("FieldOperative.bin");
        if (!file.exists()) {
            System.out.println("File not found, returning empty list.");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                try {
                    FieldOperative f1 = (FieldOperative) ois.readObject();
                    operativeList.add(f1);
                } catch (EOFException e) {
                    System.out.println("Bin file read!");
                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println("CRITICAL ERROR: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace(); // This prints the red text in the consol
            System.out.println("error");
        }
        fieldOperationTableView.getItems().addAll(operativeList);
        System.out.println("List loaded");


    }


    @javafx.fxml.FXML
    public void updateStatusButtonOnAction(ActionEvent actionEvent) {
        int target = Integer.parseInt(operativeIdTF.getText());
        for (FieldOperative f2: operativeList) {
            if (f2.getEmployeeId() == target) {
                f2.setAvailabilityStatus(NewStatusCB.getValue());
            }
        }



    }

    @javafx.fxml.FXML
    public void showButtonOnAction(ActionEvent actionEvent) {
        int target = Integer.parseInt(operativeIdTF.getText());
        for (FieldOperative f2: operativeList) {
            if (f2.getEmployeeId() == target) {
                operativeNameLabel.setText(f2.getName());
            }
        }
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