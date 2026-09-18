import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Slide21 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("greeting.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root, 420, 220));
        stage.setTitle("Lab 3");
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
