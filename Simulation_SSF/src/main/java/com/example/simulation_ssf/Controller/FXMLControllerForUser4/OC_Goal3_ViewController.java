package com.example.simulation_ssf.Controller.FXMLControllerForUser4;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.AppendableObjectOutputStream;
import com.example.simulation_ssf.nonUser.Team;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class OC_Goal3_ViewController
{
    @javafx.fxml.FXML
    private TextField operative2IdTF;
    @javafx.fxml.FXML
    private DatePicker validUntilDatePicker;
    @javafx.fxml.FXML
    private TextField teamCaptainIdTF;
    @javafx.fxml.FXML
    private TextField operative5IdTF;
    @javafx.fxml.FXML
    private TextField teamIdTF;
    @javafx.fxml.FXML
    private TextField operative1IdTF;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField teamNameTF;
    @javafx.fxml.FXML
    private TextField operative4IdTF;
    @javafx.fxml.FXML
    private TextField operative3IdTF;
    private ArrayList<Team> teamList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
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
    public void assignTeamButtonOnAction(ActionEvent actionEvent) {
        if (teamIdTF.getText().isEmpty() || teamNameTF.getText().isEmpty() || teamCaptainIdTF.getText().isEmpty() ||
                validUntilDatePicker.getValue() == null || operative1IdTF.getText().isEmpty()  || operative2IdTF.getText().isEmpty()
                || operative3IdTF.getText().isEmpty() || operative4IdTF.getText().isEmpty() ||operative5IdTF.getText().isEmpty() )
        {
            messageLabel.setText("All fields must be filled.");
            System.out.println("validation 1 done.");
            return;
        }
        //validation 3 need to be done.

        if (validUntilDatePicker.getValue().isBefore(LocalDate.now())){
            messageLabel.setText("Valid date cannot be in the past");
            System.out.println("validation 3 done.");
            return;
        }
        for (Team t : teamList){
            long tCaptain = t.getCaptainId();
            if (tCaptain == Long.parseLong(teamCaptainIdTF.getText())){
                messageLabel.setText("Team captain is already assigned in another team. ");
                System.out.println("validation 4 done.");
                return;
            }
        }
//        File teamFile = new File("TeamData.bin");
//
//        FileOutputStream dataFos = null;
//        if (teamFile.exists())
//            dataFos = new FileOutputStream(teamFile,true);
//        else
//            dataFos = new FileOutputStream(teamFile);
//        DataOutputStream dos = new DataOutputStream(dataFos);

//        try {
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TeamData.bin"));
//            oos.writeObject(teamList);
//            oos.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        File teamFile = new File("data/Team.bin");
//        try{
//            if (teamFile.exists()){
//                FileOutputStream fos = new FileOutputStream(teamFile, true);
//            }else {
//                FileOutputStream fos = new FileOutputStream(teamFile);
//            }
//
 //            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(teamList);
//            oos.close();
//            System.out.println("object stored");
//        } catch (IOException e) {
//            System.out.println("object not stored");
//        }
        ObjectOutputStream oos = null;
        try{
            File teamfile = new File("data/Team.bin");
            FileOutputStream fos = null;
            if (teamfile.exists()) {
                fos = new FileOutputStream(teamfile, true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else {
                fos = new FileOutputStream(teamfile);
                oos = new ObjectOutputStream(fos);

            }



        } catch (Exception e) {

        }


        ArrayList<Long> memberList = new ArrayList<>();
        memberList.add(Long.parseLong(operative1IdTF.getText()));
        memberList.add(Long.parseLong(operative2IdTF.getText()));
        memberList.add(Long.parseLong(operative3IdTF.getText()));
        memberList.add(Long.parseLong(operative4IdTF.getText()));
        memberList.add(Long.parseLong(operative5IdTF.getText()));

        Team t = new Team(Integer.parseInt(teamIdTF.getText()),
                teamNameTF.getText(),
                Long.parseLong(teamCaptainIdTF.getText()),
                memberList,
                validUntilDatePicker.getValue(),
                false,
                "Available"
                );
        teamList.add(t);
        System.out.println(t);
        messageLabel.setText("Team created" + t);

    }

}