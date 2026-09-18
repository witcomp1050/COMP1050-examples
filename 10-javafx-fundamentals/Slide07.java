import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Slide07 extends Application {
    @Override public void start(Stage stage) {
        Label greeting = new Label("Welcome to COMP 1050");
        VBox root = new VBox(greeting);
        root.setPadding(new Insets(20));
        stage.setScene(new Scene(root, 440, 200));
        stage.setTitle("First window");
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
