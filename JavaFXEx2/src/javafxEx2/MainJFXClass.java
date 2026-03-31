package javafxEx2;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainJFXClass extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setHeight(400);
		primaryStage.setWidth(600);
		primaryStage.setTitle("JavaFX project Example");
		
		final Button b = new Button("click Me!");
		final Button b2 = new Button("click Me again!");
		final VBox p = new VBox();
		
		p.getChildren().addAll(b, b2);
		Scene s = new Scene(p, 200, 200);
		
		primaryStage.setScene(s);
		
		primaryStage.show();

		
	}

}
