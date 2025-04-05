package payap.main.payap.controller.ui_controlller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import payap.main.payap.util.SceneManager;

public class SignInFormUIController {

    @FXML
    private TextField email_field;

    @FXML
    private TextField password_field;


    @FXML
    void handleSignIn(ActionEvent event) {
        String email = email_field.getText();
        String password = password_field.getText();

        if (email.equals("johndoe@gmail.com") && password.equals("12345")) {
            SceneManager.switchScene("dashboard.fxml");
            SceneManager.setStageTitle("Dashboard");
        }
    }
}

