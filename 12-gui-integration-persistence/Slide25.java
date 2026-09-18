import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Slide25 extends Application {
    @Override public void start(Stage stage) {
        TextField topicField = new TextField();
        TextField minutesField = new TextField();
        Label feedback = new Label();
        Button add = new Button("Add");
        add.setDefaultButton(true);
        add.setOnAction(e -> feedback.setText("Added " + topicField.getText()));
        Button clear = new Button("Clear");
        clear.setCancelButton(true);
        clear.setOnAction(e -> { topicField.clear(); minutesField.clear(); topicField.requestFocus(); });
        VBox root = new VBox(12, topicField, minutesField, new HBox(8, add, clear), feedback);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 320, 200));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
