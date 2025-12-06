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

public class EM_Goal4_Controller {
    @FXML
    private TableColumn<Equipment, String> equipmentnameTC;
    @FXML
    private TableColumn<Equipment, String> typeTC;
    @FXML
    private TableView<Equipment> removeTV;
    @FXML
    private TableColumn<Equipment, Integer> equipmentIDTC;
    @FXML
    private TableColumn<Equipment, String> statusTC;
    @FXML
    private TableColumn<Equipment, Integer> quantityTC;
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

    }
}