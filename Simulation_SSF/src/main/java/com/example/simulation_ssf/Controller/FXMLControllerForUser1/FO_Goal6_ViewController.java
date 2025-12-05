package com.example.simulation_ssf.Controller.FXMLControllerForUser1;

import com.example.simulation_ssf.SSFApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FO_Goal6_ViewController
{
    @javafx.fxml.FXML
    private TextField vippTeamMembers;
    @javafx.fxml.FXML
    private ComboBox vipTypeComboBox;
    @javafx.fxml.FXML
    private TextArea vippAssignedRouteTextField;
    @javafx.fxml.FXML
    private ComboBox vippStatus;
    @javafx.fxml.FXML
    private TableView vippTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void vippUpdateButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void vippShowInTVButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void vippToDashboardButtonOnAction(ActionEvent actionEvent) {
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