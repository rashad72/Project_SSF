package com.example.simulation_ssf.Controller.FXMLControllerForUser5;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.Equipment;
import com.example.simulation_ssf.nonUser.MonitorItem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;

public class EM_Goal6_Controller
{
    @FXML
    private TableColumn<MonitorItem,String> itemIDTC;
    @FXML
    private DatePicker lastUDateDP;
    @FXML
    private TableColumn<MonitorItem,String> statusTC;
    @FXML
    private ComboBox<String> statusCB;
    @FXML
    private TableColumn<MonitorItem, LocalDate> lastUpdatedTC;
    @FXML
    private TextField itemIDTF;
    @FXML
    private TableColumn<MonitorItem,String> categoryTC;
    @FXML
    private ComboBox<String> categoryCB;
    @FXML
    private TableView<MonitorItem> monitorAlertTV;
    @FXML
    private TableColumn<MonitorItem,Integer> quantityTC;
    @FXML
    private TableColumn<MonitorItem,Integer> minimumRequiredTC;
    @FXML
    private TableColumn<MonitorItem,String> itemNameTC;
    private ArrayList<Equipment> equipmentList = new ArrayList<>();

    @FXML
    public void initialize() {
        categoryCB.getItems().addAll("Medical", "Electrical","Safety","Furniture","Storage");
        statusCB.getItems().addAll("Available","Low Stock","Out of Stock","Damaged");
        itemIDTC.setCellValueFactory(new PropertyValueFactory<>("itemID"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        lastUpdatedTC.setCellValueFactory(new PropertyValueFactory<>("lastUpdated"));
        categoryTC.setCellValueFactory(new PropertyValueFactory<>("category"));
        quantityTC.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        minimumRequiredTC.setCellValueFactory(new PropertyValueFactory<>("minimumRequired"));
        itemNameTC.setCellValueFactory(new PropertyValueFactory<>("itemName"));
    }

    @FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {
        String idFilter = itemIDTF.getText().trim();
        String categoryFilter = categoryCB.getValue();
        String statusFilter = statusCB.getValue();
        LocalDate dateFilter = lastUDateDP.getValue();


        // Filter by Category
        ObservableList<MonitorItem> filteredList = null;
        if (categoryFilter != null) {
            filteredList = filteredList.stream()
                    .filter(item -> item.getCategory().equals(categoryFilter))
                    .collect(Collectors.toCollection(FXCollections::observableArrayList));
        }

        // Filter by Status
        if (statusFilter != null) {
            filteredList = filteredList.stream()
                    .filter(item -> item.getStatus().equals(statusFilter))
                    .collect(Collectors.toCollection(FXCollections::observableArrayList));
        }

        // Filter by Last Updated Date
        if (dateFilter != null) {
            filteredList = filteredList.stream()
                    .filter(item -> item.getLastUpdated().isEqual(dateFilter))
                    .collect(Collectors.toCollection(FXCollections::observableArrayList));
        }

        monitorAlertTV.setItems(filteredList);
    }
    }

    @FXML
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