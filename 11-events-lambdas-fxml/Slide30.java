import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Slide30 extends Application {
    @Override public void start(Stage stage) {
        TextField topicField = new TextField();
        TextField minutesField = new TextField();
        Button add = new Button("Add");
        add.setDisable(true);
        topicField.textProperty().addListener((obs, was, now) ->
            add.setDisable(now.isBlank() || minutesField.getText().isBlank()));
        minutesField.textProperty().addListener((obs, was, now) ->
            add.setDisable(now.isBlank() || topicField.getText().isBlank()));
        VBox root = new VBox(12, topicField, minutesField, add);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 320, 180));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
