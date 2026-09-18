import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Slide29 extends Application {
    @Override public void start(Stage stage) {
        ListView<String> sessions = new ListView<>();
        sessions.getItems().addAll("30 min — Maps", "45 min — Generics");
        Label detail = new Label("Select a session");
        sessions.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldValue, newValue) -> {
                detail.setText(newValue == null ? "Select a session" : "Selected: " + newValue);
            });
        VBox root = new VBox(12, sessions, detail);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 360, 260));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
