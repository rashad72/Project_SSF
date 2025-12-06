package com.example.simulation_ssf.Controller.FXMLControllerForUser5;

import com.example.simulation_ssf.SSFApplication;
import com.example.simulation_ssf.nonUser.Equipment;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;

public class EM_Goal4_Controller
{
    @FXML
    private TableColumn<Equipment,String> equipmentnameTC;
    @FXML
    private TableColumn<Equipment,String> typeTC;
    @FXML
    private TableView<Equipment> removeTV;
    @FXML
    private TableColumn<Equipment,Integer> equipmentIDTC;
    @FXML
    private TableColumn<Equipment,String> statusTC;
    @FXML
    private TableColumn<Equipment,Integer> quantityTC;
    @FXML
    private TextField equipmentIDTF;
    private ArrayList<Equipment> equipmentList = new ArrayList<>();

    @FXML
    public void initialize() {
        equipmentnameTC.setCellValueFactory(new PropertyValueFactory<>("equipmentname"));
        typeTC.setCellValueFactory(new PropertyValueFactory<>("type"));
        equipmentIDTC.setCellValueFactory(new PropertyValueFactory<>("equipmentID"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        quantityTC.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    }

    @FXML
    public void removeButtonOnAction(ActionEvent actionEvent) {
        String idText = equipmentIDTF.getText();

        if (idText.isEmpty()) {
            showAlert("Error", "Please enter Equipment ID");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idText);
        } catch (Exception e) {
            showAlert("Error", "Invalid ID format");
            return;
        }

        Equipment selected = null;

        Equipment[] equipmentList = new Equipment[0];
        for (Equipment eq : equipmentList) {
            if (eq.getEquipmentID() == id) {
                selected = eq;
                break;
            }
        }

        if (selected == null) {
            showAlert("Not Found", "No equipment found with this ID");
            return;
        }

        if (!(selected.getStatus().equalsIgnoreCase("Damaged") ||
                selected.getStatus().equalsIgnoreCase("Expired"))) {

            showAlert("Action Blocked", "Only Damaged or Expired items can be removed.");
            return;
        }

        // Show confirmation alert
        Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
        confirm.setTitle("Confirm Delete");
        confirm.setHeaderText("Are you sure?");
        confirm.setContentText("Delete equipment: " + selected.getEquipmentName());

        confirm.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                equipmentList.remove(selected);
                removeTV.refresh();
                showAlert("Success", "Equipment removed successfully");
            }
        });
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
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