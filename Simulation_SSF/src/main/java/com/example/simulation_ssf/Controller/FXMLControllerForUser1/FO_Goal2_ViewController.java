package com.example.simulation_ssf.Controller.FXMLControllerForUser1;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.AppendableObjectOutputStream;
import com.example.simulation_ssf.nonUser.IntelligenceReport;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FO_Goal2_ViewController
{
    @javafx.fxml.FXML
    private TextField fICRthreatTypeTextField;
    @javafx.fxml.FXML
    private TextField fICRLocationTextField;
    @javafx.fxml.FXML
    private TableView<IntelligenceReport> fICRTableView;
    @javafx.fxml.FXML
    private TextField fICRSuspectInfoTextField;
    @javafx.fxml.FXML
    private TextArea fICRThreatDescriptionTextField;
    @javafx.fxml.FXML
    private ComboBox<String> fICRSeverityLevelComboBox;
    @javafx.fxml.FXML
    private TableColumn<IntelligenceReport, String> siTC;
    @javafx.fxml.FXML
    private TableColumn<IntelligenceReport, String> ttTC;
    @javafx.fxml.FXML
    private TableColumn<IntelligenceReport, String> tdTC;
    @javafx.fxml.FXML
    private TableColumn<IntelligenceReport, String> lTC;
    @javafx.fxml.FXML
    private TableColumn<IntelligenceReport, String> slTC;

    private ArrayList<IntelligenceReport> iReport = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        fICRSeverityLevelComboBox.getItems().addAll("Low", "Medium", "High");
        siTC.setCellValueFactory(new PropertyValueFactory<>("suspectInfo"));
        ttTC.setCellValueFactory(new PropertyValueFactory<>("threatType"));
        tdTC.setCellValueFactory(new PropertyValueFactory<>("threatDescription"));
        lTC.setCellValueFactory(new PropertyValueFactory<>("location"));
        slTC.setCellValueFactory(new PropertyValueFactory<>("severityLevel"));

    }

    @javafx.fxml.FXML
    public void fICRSubmitButtonOnAction(ActionEvent actionEvent) {
        try {
            File messageFile = new File("IntelligenceReport.bin");
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
            oos.writeObject(iReport);
            oos.close();
            System.out.println("Object saved");
        } catch (Exception e) {
            System.out.println("Not saved");
        }
        iReport.clear();
        fICRTableView.getItems().clear();
    }


    @javafx.fxml.FXML
    public void fICRuploadEVandShowTableButtonOnAction(ActionEvent actionEvent) {
        //String threatType, String suspectInfo, String severityLevel, String location, String threatDescription
        IntelligenceReport r = new IntelligenceReport(fICRthreatTypeTextField.getText(),
                fICRSuspectInfoTextField.getText(),fICRSeverityLevelComboBox.getValue(),
                fICRLocationTextField.getText(),fICRThreatDescriptionTextField.getText());
        iReport.add(r);
        fICRTableView.getItems().add(r);

//        try {
//            File messageFile = new File("IntelligenceReport.bin");
//            FileOutputStream fos = null;
//            ObjectOutputStream oos = null;
//
//            if (messageFile.exists()){
//                fos = new FileOutputStream(messageFile, true);
//
//                oos = new AppendableObjectOutputStream(fos);
//                System.out.println("appendable");
//            }
//            else {
//                fos = new FileOutputStream(messageFile);
//                System.out.println("new");
//                oos = new ObjectOutputStream(fos);
//            }
//            oos.writeObject(r);
//            oos.close();
//            System.out.println("Object saved");
//        } catch (Exception e) {
//            System.out.println("Not saved");
//        }
    }

    @javafx.fxml.FXML
    public void fICRtoDashboardButtonOnAction(ActionEvent actionEvent) {
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