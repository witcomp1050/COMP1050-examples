import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Slide21 extends Application {
    @Override public void start(Stage stage) {
        Label title = new Label("Study sessions");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        Label error = new Label("Minutes must be a positive whole number.");
        error.setStyle("-fx-text-fill: #bf2225;");
        Button add = new Button("Add session");
        add.setDefaultButton(true);
        VBox root = new VBox(12, title, error, add);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 420, 180));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
