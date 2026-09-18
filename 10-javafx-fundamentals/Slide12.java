import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Slide12 extends Application {
    @Override public void start(Stage stage) {
        Label title = new Label("Study sessions");
        TextField topic = new TextField();
        topic.setPromptText("Topic");
        Button add = new Button("Add");
        HBox entry = new HBox(8, topic, add);
        VBox root = new VBox(12, title, entry);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 480, 240));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
