package com.example.simulation_ssf.Controller.FXMLControllerForUser5;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class EM_Goal6_Controller
{
    @javafx.fxml.FXML
    private TableColumn itemIDTC;
    @javafx.fxml.FXML
    private DatePicker lastUDateDP;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private ComboBox statusCB;
    @javafx.fxml.FXML
    private TableColumn lastUpdatedTC;
    @javafx.fxml.FXML
    private TextField itemIDTF;
    @javafx.fxml.FXML
    private TableColumn categoryTC;
    @javafx.fxml.FXML
    private ComboBox categoryCB;
    @javafx.fxml.FXML
    private TableView monitorAlertTV;
    @javafx.fxml.FXML
    private TableColumn quantityTC;
    @javafx.fxml.FXML
    private TableColumn minimumRequiredTC;
    @javafx.fxml.FXML
    private TableColumn itemNameTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashBoardButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/EquipmentManagerDashbord.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());
            Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
            currentStage.setScene(dashboardScene);
            currentStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}