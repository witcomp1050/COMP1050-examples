package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.geometry.*;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox root = (HBox)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Goldilocks and three buttons");
			
			final HBox pane = new HBox(100); 
			pane.setAlignment(Pos.CENTER);
			final Button btnP = new Button("Papa");
			final Button btnM = new Button("Mama");
			final Button btnB = new Button("Baby");

			pane.getChildren().addAll(btnP, btnM, btnB);
			
			btnB.setOnAction(new JustRight());
//			
			btnP.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					System.out.printf("Too Hot!%n");
				}
			});

			btnM.setOnAction(e->{
				System.out.printf("Too Cold!%n");
			});

			
			
			primaryStage.setTitle("Goldilocks and the Three Buttons");
			primaryStage.setScene(new Scene(pane));
			
			
			
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private static class JustRight implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			System.out.printf("Just right :)%n");
		}
	}

}
