import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Slide19 extends Application {
    @Override public void start(Stage stage) {
        TextField minutesField = new TextField("45");
        Label feedback = new Label();
        String typed = minutesField.getText().strip();
        int minutes = Integer.parseInt(typed);
        feedback.setText("You typed " + minutes + " minutes");
        minutesField.clear();
        VBox root = new VBox(12, minutesField, feedback);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 360, 140));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
