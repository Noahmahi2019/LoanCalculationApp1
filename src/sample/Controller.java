package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.text.NumberFormat;

public class Controller {

    @FXML
    private TextField principalTextField;
    @FXML
    private TextField interestTextField;
    @FXML
    private TextField numberOfYearsTextField;

    public void onCalculate(ActionEvent actionEvent) {
        double monthlyAmount = 0;
        double principal = Double.parseDouble(principalTextField.getText());
        double interest = Double.parseDouble(interestTextField.getText());
        int years = (int) Double.parseDouble(numberOfYearsTextField.getText());

        monthlyAmount = (principal * interest / 1 - (Math.pow(1 / (1 + interest), (years * 12))));
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("monthly payment amount");
        alert.setHeaderText(null);
        alert.show();
    }

    }
