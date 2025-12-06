package com.example.simulation_ssf.Controller.FXMLControllerForUser4;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.User.FieldOperative;
import com.example.simulation_ssf.nonUser.AppendableObjectOutputStream;
import com.example.simulation_ssf.nonUser.Team;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class OC_Goal4_ViewController
{

    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private ComboBox<String> isCaptainCB;
    @javafx.fxml.FXML
    private TextField addressTF;
    @javafx.fxml.FXML
    private DatePicker joinDatePicker;
    @javafx.fxml.FXML
    private TextField nIdTF;
    @javafx.fxml.FXML
    private TextField employeeIdTF;
    @javafx.fxml.FXML
    private Label messageLabel;
    private ArrayList<FieldOperative> operativeList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        isCaptainCB.getItems().addAll("Yes", "No");
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
    public void createOperativeButtonOnAction(ActionEvent actionEvent) {
        boolean captainFlag = false;
        if (isCaptainCB.getValue().equals("Yes")){
             captainFlag = true;
        }

        //    public FieldOperative(long nID, long phoneNo, String name, String mailAddress, long employeeId, LocalDate joinDate,
        //    String presentAddress, boolean isCaptain, boolean inMission, int currentMissionId, String availabilityStatus) {
        FieldOperative f = new FieldOperative(Long.parseLong(nIdTF.getText()),Long.parseLong(phoneTF.getText()),nameTF.getText(),
                emailTF.getText(),Long.parseLong(employeeIdTF.getText()), joinDatePicker.getValue(),addressTF.getText(),captainFlag, false,
                00,"Available"
                );

        operativeList.add(f);
        System.out.println(f);

        try {
            File file = new File("FieldOperative.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            if (file.exists()){
                fos = new FileOutputStream(file, true);

                oos = new AppendableObjectOutputStream(fos);
                System.out.println("appendable");
            }
            else {
                fos = new FileOutputStream(file);
                System.out.println("new");
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(f);
            oos.close();
            System.out.println("Object saved");
        } catch (Exception e) {
            System.out.println("Not saved");;
        }

    }
}