import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Slide08 extends Application {
    @Override public void start(Stage stage) {
        Button greet = new Button("Greet");
        TextField nameField = new TextField();
        Label message = new Label();
        greet.setOnAction(event -> message.setText("Hello!"));
        greet.setOnAction(event -> {
            String name = nameField.getText().strip();
            message.setText(name.isEmpty() ? "Enter a name." : "Hello, " + name + "!");
        });
        VBox root = new VBox(12, nameField, greet, message);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 300, 180));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
