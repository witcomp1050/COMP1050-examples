import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Slide20 {
    @FXML private TextField nameField;
    @FXML private Button greetButton;
    @FXML private Label feedbackLabel;

    @FXML
    private void onGreet() {
        feedbackLabel.setText(Greeter.greet(nameField.getText()));
    }
}

final class Greeter {
    private Greeter() { }
    static String greet(String name) {
        if (name == null || name.isBlank()) return "Enter a name.";
        return "Hello, " + name.strip() + "!";
    }
}
