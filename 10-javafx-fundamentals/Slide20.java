import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.List;

public class Slide20 extends Application {
    @Override public void start(Stage stage) {
        ListView<String> sessions = new ListView<>();
        sessions.getItems().add("45 min — Generics");
        sessions.getItems().add("30 min — Maps");
        sessions.getItems().setAll(List.of("20 min — Loops", "15 min — Setup"));
        sessions.getSelectionModel().select(0);
        stage.setScene(new Scene(new VBox(sessions), 360, 200));
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
