import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MainFormController {

    public TextField celsiusField;
    public TextField fahrenheitField;

    public void celsiusToFahrenheit(ActionEvent actionEvent) {
        try {
            double fahrenheit = (Double.parseDouble(celsiusField.getText())*9/5)+32;
            fahrenheitField.setText(String.valueOf(fahrenheit));
        }catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Incorrect input type");
            alert.setContentText("Input a valid number");
            alert.showAndWait();
        }
    }
    public void fahrenheitToCelsius(ActionEvent actionEvent) {
        try {
            double celsius = (Double.parseDouble(fahrenheitField.getText())-32)*5/9;
            celsiusField.setText(String.valueOf(celsius));
        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Incorrect input type");
            alert.setContentText("Input a valid number");
            alert.showAndWait();
        }
    }
}
