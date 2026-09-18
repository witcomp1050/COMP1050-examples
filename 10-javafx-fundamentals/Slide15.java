import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Slide15 extends Application {
    @Override public void start(Stage stage) {
        GridPane form = new GridPane();
        form.setHgap(8); form.setVgap(8);
        TextField field = new TextField();
        field.setMaxWidth(Double.MAX_VALUE);
        GridPane.setHgrow(field, Priority.ALWAYS);
        form.add(new Label("Topic"), 0, 0);
        form.add(field, 1, 0);
        ListView<String> sessions = new ListView<>();
        VBox root = new VBox(12, form, sessions);
        VBox.setVgrow(sessions, Priority.ALWAYS);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 480, 360));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
