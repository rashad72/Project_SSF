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
import java.util.ArrayList;

public class CO_Goal3_ViewController
{
    @javafx.fxml.FXML
    private TableColumn messageIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn missionIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn missionTypeTableColumn;
    @javafx.fxml.FXML
    private TextField messageIdTF;
    @javafx.fxml.FXML
    private TableView incomingMessagesTableView;
    @javafx.fxml.FXML
    private TableColumn subjectTableColumn;
    @javafx.fxml.FXML
    private TableColumn currentStatusTableColumn;
    @javafx.fxml.FXML
    private Label messageContentLabel;
    @javafx.fxml.FXML
    private Label senderNameLabel;
    @javafx.fxml.FXML
    private TableColumn senderIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    private ArrayList<Message> messageList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        missionTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("missionType"));
        subjectTableColumn.setCellValueFactory(new PropertyValueFactory<>("subject"));
        currentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        messageIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("messageId"));
        missionIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("missionId"));
        senderIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("senderId"));
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
                    Message m1 = (Message) ois.readObject();
                    messageList.add(m1);
                } catch (EOFException e) {
                    System.out.println("Bin file read!");
                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println("error");
        }
        ArrayList<Message> tempList = new ArrayList<>();
        for(Message m : messageList){
            if (m.getStatus().equals("UNREAD")){
                tempList.add(m);
            }

        }
        incomingMessagesTableView.getItems().addAll(tempList);

    }

    @javafx.fxml.FXML
    public void markMessageAsAcknowledgeButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewMessageButtonOnAction(ActionEvent actionEvent) {
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
    public void refreshIncomingMessageButtonOnAction(ActionEvent actionEvent) {
    }
}