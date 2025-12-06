package com.example.simulation_ssf.Controller.FXMLControllerForUser1;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.SecurityPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class FO_Goal1_ViewController
{
    @javafx.fxml.FXML
    private DatePicker oGSSPDatePicker;
    @javafx.fxml.FXML
    private TextField oGSSPmissionIDTextField;
    @javafx.fxml.FXML
    private TableColumn<SecurityPanel, String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<SecurityPanel, Integer> missionIdTC;
    @javafx.fxml.FXML
    private TableColumn<SecurityPanel, LocalDate> dateTC;
    @javafx.fxml.FXML
    private TableView<SecurityPanel> oGSSPTV;
    @javafx.fxml.FXML
    private ComboBox<String> statusCombobox;

    private ArrayList<SecurityPanel> pList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        statusCombobox.getItems().addAll("Ongoing", "Upcoming", "In Progress", "Completed", "Failed");
        missionIdTC.setCellValueFactory(new PropertyValueFactory<>("missionID"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void oGSSPsurveillanceButtonOnAction(ActionEvent actionEvent) {
        // int missionID, LocalDate date, String status
        SecurityPanel panel = new SecurityPanel(Integer.parseInt(oGSSPmissionIDTextField.getText()), oGSSPDatePicker.getValue(), statusCombobox.getValue());
        pList.add(panel);
        oGSSPTV.getItems().add(panel);
    }

    @javafx.fxml.FXML
    public void oGSSPSubmitReportButtonOnAction(ActionEvent actionEvent) {
        try{
            File file = new File("SecurityPanel.bin");

            if(file.exists()){
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
            }
        }
        catch(Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void oGSSPStartPatrolButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void oGSSPtoDashboardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/FieldOperative.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(dashboardScene);
            currentStage.show();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}