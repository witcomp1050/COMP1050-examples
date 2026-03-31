package jfxExamples;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JFX extends javafx.application.Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setHeight(200);
		primaryStage.setWidth(300);
		primaryStage.setTitle("My first JavaFX Project");
		
//		Button b = new Button("hello");
//		Scene s1 = new Scene(b);
//		primaryStage.setScene(s1);
		primaryStage.show();
	}
	

}
