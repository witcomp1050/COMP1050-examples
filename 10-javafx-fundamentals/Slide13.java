import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Slide13 extends Application {
    @Override public void start(Stage stage) {
        GridPane form = new GridPane();
        form.setHgap(8);
        form.setVgap(8);
        form.setPadding(new Insets(16));
        
        Label topicLabel = new Label("Topic");
        TextField topicField = new TextField();
        topicLabel.setLabelFor(topicField);
        form.add(topicLabel, 0, 0);
        form.add(topicField, 1, 0);
        form.add(new Label("Minutes"), 0, 1);
        form.add(new TextField(), 1, 1);
        form.add(new Button("Add session"), 1, 2);
        stage.setScene(new Scene(form, 420, 200));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
