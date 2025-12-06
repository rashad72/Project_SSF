package com.example.simulation_ssf.Controller.FXMLControllerForUser2;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class VD_Goal4_ViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> ssccStatusComboBox;
    @javafx.fxml.FXML
    private TextArea ssccNotesTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> ssccCheckListItemsComboBox;
    @javafx.fxml.FXML
    private DatePicker ssccCheckingDatePicker;
    @javafx.fxml.FXML
    private TableView ssccTableView;

    @javafx.fxml.FXML
    public void initialize() {
        ssccStatusComboBox.getItems().addAll("Seatbelts","Break","Tires","Lights","Door Locks","Vehicle Document");
        ssccCheckListItemsComboBox.getItems().addAll("OK","Need Repair","Critical");
    }

    @javafx.fxml.FXML
    public void ssccSubmitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ssccToDashboardButtonOnAction(ActionEvent actionEvent) {
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
}