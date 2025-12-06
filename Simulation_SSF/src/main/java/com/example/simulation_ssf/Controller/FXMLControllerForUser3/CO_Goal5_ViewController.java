package com.example.simulation_ssf.Controller.FXMLControllerForUser3;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class CO_Goal5_ViewController
{
    @javafx.fxml.FXML
    private Label logContentLabel;
    @javafx.fxml.FXML
    private TableColumn<Message, Integer> messageIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Message, Integer> missionIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Message, Integer> senderTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Message, String> missionTypeTableColumn;
    @javafx.fxml.FXML
    private TextField messageIdTF;
    @javafx.fxml.FXML
    private TableColumn<Message, String> currentStatusTableColumn;
    @javafx.fxml.FXML
    private TableView<Message> logTableView;
    @javafx.fxml.FXML
    private TableColumn<Message, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private Label senderNameLabel;
    @javafx.fxml.FXML
    private TableColumn<Message, String> subjectTableColumn;
    private ArrayList<Message> logList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {


        missionTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("missionType"));
        subjectTableColumn.setCellValueFactory(new PropertyValueFactory<>("subject"));
        currentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        messageIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("messageId"));
        missionIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("missionId"));
        senderTableColumn.setCellValueFactory(new PropertyValueFactory<>("senderId"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("timestamp"));

        File file = new File("Message.bin");
        if (!file.exists()) {
            System.out.println("File not found, returning empty list.");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                try {
                    Message l1 = (Message) ois.readObject();
                    logList.add(l1);
                } catch (EOFException e) {
                    System.out.println("Bin file read!");
                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println("error");
        }
                logTableView.getItems().addAll(logList);
    }

    @javafx.fxml.FXML
    public void exportVerifiedLogsButtonOnAction(ActionEvent actionEvent) {
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
    public void showLogButtonOnAction(ActionEvent actionEvent) {
        int target = Integer.parseInt(messageIdTF.getText());
        for (Message m2: logList) {
            if (m2.getMessageId() == target) {
                senderNameLabel.setText(Integer.toString(m2.getSenderId()));
                logContentLabel.setText(m2.getContent());
            }

        }
    }

    @javafx.fxml.FXML
    public void markMessageAsVerifiedButtonOnAction(ActionEvent actionEvent) {
        int target = Integer.parseInt(messageIdTF.getText());
        for (Message m2: logList) {
            if (m2.getMessageId() == target) {
                m2.setStatus("Verified");

            }
        }
    }

    @javafx.fxml.FXML
    public void refreshIncomingMessageButtonOnAction(ActionEvent actionEvent) {
        messageIdTF.clear();
    }
}