import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Slide07 extends Application {
    @Override public void start(Stage stage) {
        Button greet = new Button("Greet");
        Label message = new Label();
        greet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                message.setText("Hello!");
            }
        });
        VBox root = new VBox(12, greet, message);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 300, 140));
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
