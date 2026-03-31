package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Goldilocks extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		final HBox pane = new HBox(100); 
		pane.setAlignment(Pos.CENTER);
		final Button btnP = new Button("Papa");
		final Button btnM = new Button("Mama");
		final Button btnB = new Button("Baby");

		pane.getChildren().addAll(btnP, btnM, btnB);
		
		btnB.setOnAction(new JustRight());
		
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

		
	}
	
	
	public class JustRight implements EventHandler<ActionEvent> {
		
		@Override
		public void handle(ActionEvent event) {
			System.out.printf("Just right :)%n");
		}
		
	}


}
