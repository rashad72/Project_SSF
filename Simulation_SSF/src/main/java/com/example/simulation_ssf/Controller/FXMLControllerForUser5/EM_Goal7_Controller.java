package com.example.simulation_ssf.Controller.FXMLControllerForUser5;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.Equipment;
import com.example.simulation_ssf.nonUser.MaintenanceItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;

public class EM_Goal7_Controller
{
    @javafx.fxml.FXML
    private TableColumn<MaintenanceItem,String> equipmentNameTC;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceItem,String> categoryTC;
    @javafx.fxml.FXML
    private DatePicker nextMainDateDP;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceItem,String> technicianTC;
    @javafx.fxml.FXML
    private TableView<MaintenanceItem> setOrUpdateMainDateTV;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceItem,String> equipmentIDTC;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceItem,String> statusTC;
    @javafx.fxml.FXML
    private Label outputL;
    @javafx.fxml.FXML
    private ComboBox<String> categoryCB;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceItem, LocalDate> lastMaintenDateTC;
    @javafx.fxml.FXML
    private TextField equipmentIDTF;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceItem,LocalDate> nextMainteDateTC;
    private ArrayList<Equipment> equipmentList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        categoryCB.getItems().addAll("Medical","Electrical","Safety","Furniture");
        statusCB.getItems().addAll("Working","Faulty","Under Maintenance");
        equipmentIDTC.setCellValueFactory(new PropertyValueFactory<>("equipmentID"));
        equipmentNameTC.setCellValueFactory(new PropertyValueFactory<>("equipmentName"));
        categoryTC.setCellValueFactory(new PropertyValueFactory<>("category"));
        technicianTC.setCellValueFactory(new PropertyValueFactory<>("technician"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        lastMaintenDateTC.setCellValueFactory(new PropertyValueFactory<>("lastMaintenDate"));
        nextMainteDateTC.setCellValueFactory(new PropertyValueFactory<>("nextMainteDate"));








    }

    @javafx.fxml.FXML
    public void updateButtonOnAction(ActionEvent actionEvent) {
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