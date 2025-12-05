package com.example.simulation_ssf;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginViewController
{
    @javafx.fxml.FXML
    private PasswordField loginUserIdPasswordTextField;
    @javafx.fxml.FXML
    private ComboBox<String> loginUserTypeComboBox;
    @javafx.fxml.FXML
    private Label loginOutputLabel;
    @javafx.fxml.FXML
    private TextField loginUserIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
        loginUserTypeComboBox.getItems().addAll("Field Operative","Vehicle Driver","Communication Officer","Operation Commander","Equipment Manager","Intelligence Analyst");
    }

    @javafx.fxml.FXML
    public void signInButtonOnAction(ActionEvent actionEvent) {
        String loginUserType = loginUserTypeComboBox.getValue();
        if (loginUserType.equals("Field Operative")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/FieldOperative.fxml"));
                Scene dashboardScene = new Scene(fxmlLoader.load());
                Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                currentStage.setScene(dashboardScene);
                currentStage.show();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (loginUserType.equals("Vehicle Driver")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/VehicleDriver.fxml"));
                Scene dashboardScene = new Scene(fxmlLoader.load());
                Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                currentStage.setScene(dashboardScene);
                currentStage.show();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (loginUserType.equals("Communication Officer")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/CommunicationOfficerDashboard.fxml"));
                Scene dashboardScene = new Scene(fxmlLoader.load());
                Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
                currentStage.setScene(dashboardScene);
                currentStage.show();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }


            //fxml Load
        }
        if (loginUserType.equals("Operation Commander")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/OperationCommanderDashboard.fxml"));
                Scene dashboardScene = new Scene(fxmlLoader.load());
                Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            Stage currentStage = (Stage) dashboardButton.getScene().getWindow();
                currentStage.setScene(dashboardScene);
                currentStage.show();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            //fxml Load
        }
        if (loginUserType.equals("Equipment Manager")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/EquipmentManagerDashbord.fxml"));
                Scene dashboardScene = new Scene(fxmlLoader.load());
                Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                currentStage.setScene(dashboardScene);
                currentStage.show();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (loginUserType.equals("Intelligence Analyst")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(SSFApplication.class.getResource("/com/example/simulation_ssf/DashboardOfUsers/IntelligenceAnalyst.fxml"));
                Scene dashboardScene = new Scene(fxmlLoader.load());
                Stage currentStage =(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                currentStage.setScene(dashboardScene);
                currentStage.show();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}