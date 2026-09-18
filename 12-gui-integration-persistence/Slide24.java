import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Slide24 extends Application {
    @Override public void start(Stage stage) {
        Label topicLabel = new Label("_Topic");
        TextField topicField = new TextField();
        topicLabel.setLabelFor(topicField);
        topicLabel.setMnemonicParsing(true);
        topicField.setTooltip(new Tooltip("What you studied, for example Maps"));
        VBox root = new VBox(8, topicLabel, topicField);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 300, 120));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
