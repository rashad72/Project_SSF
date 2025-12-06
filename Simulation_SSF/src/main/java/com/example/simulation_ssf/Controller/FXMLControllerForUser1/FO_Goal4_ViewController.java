package com.example.simulation_ssf.Controller.FXMLControllerForUser1;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.AppendableObjectOutputStream;
import com.example.simulation_ssf.nonUser.Mission;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FO_Goal4_ViewController
{
    @javafx.fxml.FXML
    private TableView<Mission> podrTableView;
    @javafx.fxml.FXML
    private TextArea podrOperationSummaryTextArea;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> mnTC;
    @javafx.fxml.FXML
    private TableColumn<Mission, Integer> mIdTC;
    @javafx.fxml.FXML
    private TextArea podrAdressTextArea;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> osTC;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> adressTC;
    @javafx.fxml.FXML
    private TextField podrMissionNameTextField;

    private ArrayList<Mission> m = new ArrayList<>();
    @javafx.fxml.FXML
    private TextField podrMissionIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
        mnTC.setCellValueFactory(new PropertyValueFactory<>("missionName"));
        mIdTC.setCellValueFactory(new PropertyValueFactory<>("missionId"));
        osTC.setCellValueFactory(new PropertyValueFactory<>("description"));
        adressTC.setCellValueFactory(new PropertyValueFactory<>("address"));
    }

    @javafx.fxml.FXML
    public void podrSubmitButtonOnAction(ActionEvent actionEvent) {
        try {
            File messageFile = new File("FileOperativeEquipment.bin");
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
        m.clear();
        podrTableView.getItems().clear();
    }

    @Deprecated
    public void podrMissionIdTextField(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void podrTableLoadButtonOnAction(ActionEvent actionEvent) {
        Mission m1 = new Mission(Integer.parseInt(podrMissionIdTextField.getText()),podrMissionNameTextField.getText(),null,null,null,null,00,podrOperationSummaryTextArea.getText(),podrAdressTextArea.getText(),false,null);
        m.add(m1);
        podrTableView.getItems().add(m1);

    }

    @javafx.fxml.FXML
    public void podrToDashboardButtonOnAction(ActionEvent actionEvent) {
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