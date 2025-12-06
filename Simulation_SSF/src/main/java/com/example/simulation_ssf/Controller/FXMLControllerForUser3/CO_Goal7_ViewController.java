package com.example.simulation_ssf.Controller.FXMLControllerForUser3;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.Message;
import com.example.simulation_ssf.nonUser.Notification;
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

public class CO_Goal7_ViewController
{
    @javafx.fxml.FXML
    private TableColumn<Notification, String> alertIdTableColumn;
    @javafx.fxml.FXML
    private DatePicker alertDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Notification, String> messageTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Notification, String> priorityTableColumn;
    @javafx.fxml.FXML
    private TextField alertIdTF;
    @javafx.fxml.FXML
    private Label messageContentLabel;
    @javafx.fxml.FXML
    private TableView<Notification> alertMessagesTableView;
    @javafx.fxml.FXML
    private TableColumn<Notification, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Notification, String> categoryTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> priorityFilterCB;
    private ArrayList<Notification> notificationArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        priorityFilterCB.getItems().addAll("High", "Medium", "Low");
        //    public Notification(String alertId, String category,
        //    String message, LocalDate date, String priority, String status) {
        alertIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("alertId"));
        messageTableColumn.setCellValueFactory(new PropertyValueFactory<>("message"));
        priorityTableColumn.setCellValueFactory(new PropertyValueFactory<>("priority"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        categoryTableColumn.setCellValueFactory(new PropertyValueFactory<>("category"));

        File file = new File("Notification.bin");
        if (!file.exists()) {
            System.out.println("File not found, returning empty list.");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                try {
                    Notification n1 = (Notification) ois.readObject();
                    notificationArrayList.add(n1);
                } catch (EOFException e) {
                    System.out.println("Bin file read!");
                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println("error");
        }



        alertMessagesTableView.getItems().addAll(notificationArrayList);

    }

    @javafx.fxml.FXML
    public void markMessageAsReadButtonOnAction(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {
    }
}