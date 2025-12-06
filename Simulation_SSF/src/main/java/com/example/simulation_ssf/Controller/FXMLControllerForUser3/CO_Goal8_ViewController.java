package com.example.simulation_ssf.Controller.FXMLControllerForUser3;

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

public class CO_Goal8_ViewController
{
    @javafx.fxml.FXML
    private TableView<Message> messagesTableView;
    @javafx.fxml.FXML
    private TableColumn<Message, Integer> messageIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Message, Integer> missionIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Message, Integer> senderTableColumn;
    @javafx.fxml.FXML
    private TextField messageIdTF;
    @javafx.fxml.FXML
    private TextField missionIdTF;
    @javafx.fxml.FXML
    private TableColumn<Message, String> currentStatusTableColumn;
    @javafx.fxml.FXML
    private Label messageContentLabel;
    @javafx.fxml.FXML
    private DatePicker recordsDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Message, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private Label senderNameLabel;
    @javafx.fxml.FXML
    private TableColumn<Message, Integer> receiverTableColumn;
    private ArrayList<Message> messageList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        //    public Message(int messageId, int senderId, int receiverId, int missionId, String subject, String content,
        //    LocalDate timestamp, String status, String missionType) {

        receiverTableColumn.setCellValueFactory(new PropertyValueFactory<>("receiverId"));
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
        messagesTableView.getItems().addAll(messageList);





    }

    @javafx.fxml.FXML
    public void markMessageAsArchiveButtonOnAction(ActionEvent actionEvent) {
        int target = Integer.parseInt(messageIdTF.getText());
        for (Message m2: messageList) {
            if (m2.getMessageId() == target) {
                m2.setStatus("Archived");

            }
        }
    }

    @javafx.fxml.FXML
    public void viewMessageButtonOnAction(ActionEvent actionEvent) {

        int target = Integer.parseInt(messageIdTF.getText());
        for (Message m2: messageList) {
            if (m2.getMessageId() == target) {
                messageContentLabel.setText(m2.getContent());
                senderNameLabel.setText(Integer.toString(m2.getSenderId()));
            }
        }
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

    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {
    }
}