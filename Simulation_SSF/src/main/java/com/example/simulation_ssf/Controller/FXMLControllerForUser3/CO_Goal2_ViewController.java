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

public class CO_Goal2_ViewController
{
    @javafx.fxml.FXML
    private TextField filterAddressTF;
    @javafx.fxml.FXML
    private ComboBox<String> filterMissionStatusCB;
    @javafx.fxml.FXML
    private TextField senderIdTF;
    @javafx.fxml.FXML
    private TableColumn<Message, Integer> missionIdTableColumn;
    @javafx.fxml.FXML
    private TextField messageTF;
    @javafx.fxml.FXML
    private DatePicker filterDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> currentStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> missionTypeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> subjectTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Mission, Integer> messageIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Mission, Integer> senderIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Mission, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private TableView<Message> messageTableView;
    private ArrayList<Message> messageList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        filterMissionStatusCB.getItems().addAll("UNREAD", "READ", "ARCHIVED");
        //    public Message(int messageId, int senderId, int receiverId, int missionId, String subject, String content,
        //    LocalDate timestamp, String status, String missionType) {
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
        messageTableView.getItems().addAll(messageList);

    }

    @javafx.fxml.FXML
    public void sendMessageButtonOnAction(ActionEvent actionEvent) {
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