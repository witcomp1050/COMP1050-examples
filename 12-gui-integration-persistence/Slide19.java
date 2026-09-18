import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javafx.stage.FileChooser;
import java.io.File;

public class Slide19 extends Application {
    @Override public void start(Stage stage) {
        Button save = new Button("Save as…");
        Label status = new Label();
        save.setOnAction(e -> {
            FileChooser chooser = new FileChooser();
            chooser.setTitle("Save plan");
            chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Tab-separated plan", "*.tsv"));
            File chosen = chooser.showSaveDialog(stage);
            status.setText(chosen == null ? "Cancelled" : "Would save to " + chosen.getName());
        });
        VBox root = new VBox(12, save, status);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 320, 120));
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
