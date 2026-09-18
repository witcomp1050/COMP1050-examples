import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Slide13 extends Application {
    @Override public void start(Stage stage) {
        TextField minutesField = new TextField();
        minutesField.setTextFormatter(new TextFormatter<>(change ->
            change.getControlNewText().matches("\\d*") ? change : null));
        VBox root = new VBox(12, new Label("Minutes"), minutesField);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 300, 120));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
