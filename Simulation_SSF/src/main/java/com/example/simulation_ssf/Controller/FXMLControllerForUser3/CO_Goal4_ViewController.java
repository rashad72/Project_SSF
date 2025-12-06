package com.example.simulation_ssf.Controller.FXMLControllerForUser3;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.AppendableObjectOutputStream;
import com.example.simulation_ssf.nonUser.Notification;
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

public class CO_Goal4_ViewController
{

    @javafx.fxml.FXML
    private ComboBox<String> alertCategoryCB;
    @javafx.fxml.FXML
    private ComboBox<String> priorityCB;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField alertIDTF;
    @javafx.fxml.FXML
    private TextField contentTF;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    private ArrayList<Notification> notificationList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        alertCategoryCB.getItems().addAll("Security", "System", "Mission");
        priorityCB.getItems().addAll("High", "Medium", "Low");
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
    public void generateAlertButtonOnAction(ActionEvent actionEvent) {
        //    public Notification(String alertId, String category,
        //    String message, LocalDate date, String priority, String status) {
        Notification n = new Notification(alertIDTF.getText(),
                             alertCategoryCB.getValue(),contentTF.getText(),
                             DatePicker.getValue(), priorityCB.getValue(),
                             "UNREAD"
        );
        notificationList.add(n);
        outputLabel.setText("Alert Created" + n);
        System.out.println(n);

        try {
            File file = new File("Notification.bin");
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
            oos.writeObject(n);
            oos.close();
            System.out.println("Object saved");
        } catch (Exception e) {
            System.out.println("Not saved");;
        }


    }
}