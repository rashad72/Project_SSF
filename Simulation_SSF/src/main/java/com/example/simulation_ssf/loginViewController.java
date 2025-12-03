package com.example.simulation_ssf;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
            //fxml Load
        }
        if (loginUserType.equals("Vehicle Driver")){
            //fxml Load
        }
        if (loginUserType.equals("Communication Officer")){
            //fxml Load
        }
        if (loginUserType.equals("Operation Commander")){
            //fxml Load
        }
        if (loginUserType.equals("Equipment Manager")){
            //fxml Load
        }
        if (loginUserType.equals("Intelligence Analyst")){
            //fxml Load
        }
    }
}