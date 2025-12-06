package com.example.simulation_ssf.Controller.FXMLControllerForUser2;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.AppendableObjectOutputStream;
import com.example.simulation_ssf.nonUser.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class VD_Goal5_ViewController
{
    @javafx.fxml.FXML
    private DatePicker cmcDatePicker;
    @javafx.fxml.FXML
    private TextArea cmcMessageBodyTextArea;
    @javafx.fxml.FXML
    private TableView cmcTableView;
    @javafx.fxml.FXML
    private TextField cmcMissionIdTextField;
    @javafx.fxml.FXML
    private TextField cmcEmployeeIdTextField;
    @javafx.fxml.FXML
    private TextField cmcMessageSubjectTextField;
    @javafx.fxml.FXML
    private ComboBox<String> cmcMissionTypeComboBox;

    private ArrayList<Message> messageList = new ArrayList<>();
    @javafx.fxml.FXML
    private TextField cmcMessageIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
        cmcMissionTypeComboBox.getItems().addAll("Rescue","Surveillance","Protection");
    }

    @javafx.fxml.FXML
    public void cmcSubmitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cmcToDashboardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/VehicleDriver.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(dashboardScene);
            currentStage.show();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void cmcSendMessageButtonOnAction(ActionEvent actionEvent) {
        //int messageId, int senderId, int receiverId, int missionId, String subject, String content, LocalDate timestamp, String status, String missionType
        Message m = new Message(Integer.parseInt(cmcMessageIdTextField.getText()),Integer.parseInt(cmcEmployeeIdTextField.getText()),
                00,Integer.parseInt(cmcMissionIdTextField.getText()),cmcMessageSubjectTextField.getText(),
                cmcMessageBodyTextArea.getText(),cmcDatePicker.getValue(),"UNREAD",cmcMissionTypeComboBox.getValue());
        messageList.add(m);

        try {
            File messageFile = new File("Message.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            if (messageFile.exists()){
                fos = new FileOutputStream(messageFile, true);

                oos = new AppendableObjectOutputStream(fos);
                System.out.println("appendable");
            }
            else {
                fos = new FileOutputStream(messageFile);
                System.out.println("new");
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(m);
            oos.close();
            System.out.println("Object saved");
        } catch (Exception e) {
            System.out.println("Not saved");
        }
    }
}