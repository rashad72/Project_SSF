package com.example.simulation_ssf.Controller.FXMLControllerForUser4;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.AppendableObjectOutputStream;
import com.example.simulation_ssf.nonUser.Mission;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class OC_Goal2_ViewController
{
    @FXML
    private DatePicker assignDatePicker;
    @FXML
    private ComboBox<String> missionTypeCB;
    @FXML
    private TextField missionIdTF;
    @FXML
    private TextField objectiveTF;
    @FXML
    private TextField addressTF;
    @FXML
    private TextField teamIdTF;
    @FXML
    private Label messageLabel;
    @FXML
    private TextField missionNameTF;
    private ArrayList<Mission> missionList = new ArrayList<>();
    @FXML
    private TextField descriptionTF;

    @FXML
    public void initialize() {
        missionTypeCB.getItems().addAll("Rescue", "Surveillance", "Protection");
    }

    @FXML
    public void confirmButtonOnAction(ActionEvent actionEvent) {
        if (missionIdTF.getText().isEmpty() || missionNameTF.getText().isEmpty() || missionTypeCB.getValue() == null
                || assignDatePicker.getValue() == null ||   objectiveTF.getText().isEmpty() ||  teamIdTF.getText().isEmpty()
                || descriptionTF.getText().isEmpty()    ||    addressTF.getText().isEmpty())
        {   messageLabel.setText("All Fields are not filled. Fill all to Create mission.");
            System.out.println("validation 2 done");
            return;

            }
//         validation have to fix.........
//        int missionId = 0;
//        int teamId = 0;
//        try {
//            missionId = Integer.parseInt(missionIdTF.getText());
//            teamId = Integer.parseInt(teamIdTF.getText());
//
//        } catch (NumberFormatException e) {
//            System.out.println("validation 1 done");
//            messageLabel.setText("Mission ID and Team ID must be valid integers.");
//        }
//        ArrayList<Mission> missionList = null
//      data and array have to fix.......
//        for (Mission m:  missionList){
//            if (missionList.getMissionId() == Integer.parseInt(missionIdTF.getText())){
//                messageLabel.setText("A Mission with this ID is already exist.");
//                return;
//            }
//        }
//        for (Mission m:  missionList){
//            if (m.getStatus().equals("Ongoing")
//                                &&
//                    missionList.getAssignTeamId() == Integer.parseInt(teamIdTF.getText())){
//                messageLabel.setText("This team is already in a mission. Give another Team Id.");
//                return;
//            }
//        }



        Mission m = new Mission(
                Integer.parseInt(missionIdTF.getText()),
                missionNameTF.getText(),
                missionTypeCB.getValue(),
                assignDatePicker.getValue(),
                objectiveTF.getText(),
                "Ongoing",
                Integer.parseInt(teamIdTF.getText()),
                descriptionTF.getText(),
                addressTF.getText(),
                false,
                null);
        System.out.println(m);
        messageLabel.setText("Created.");
        missionList.add(m);
        try {
            File missionFile = new File("Mission.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            if (missionFile.exists()){
                fos = new FileOutputStream(missionFile, true);

                oos = new AppendableObjectOutputStream(fos);
                System.out.println("appendable");
            }
            else {
                fos = new FileOutputStream(missionFile);
                System.out.println("new");
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(m);
            oos.close();
            System.out.println("Object saved");
        } catch (Exception e) {
            System.out.println("Not saved");;
        }

    }

    @Deprecated
    public void exportAsPDFButtonOnAction(ActionEvent actionEvent) {
    }

    @FXML
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
}