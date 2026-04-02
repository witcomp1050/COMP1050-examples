package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Waldo2 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p = new Pane();
		Text waldo = new Text("Waldo");
		waldo.setX(100);
		waldo.setY(100);
		
		
//		waldo.setOnKeyPressed(new EventHandler<KeyEvent>() {
//			@Override
//			public void handle(KeyEvent event) {
//				if ((event.getCode() == KeyCode.UP) || (event.getCode() == KeyCode.W)) {
//					waldo.setY(waldo.getY()-2);
//				} else if (event.getCode() == KeyCode.DOWN) {
//					waldo.setY(waldo.getY()+2);
//				} else if (event.getCode() == KeyCode.LEFT) {
//					waldo.setX(waldo.getX()-2);
//				} else if (event.getCode() == KeyCode.RIGHT) {
//					waldo.setX(waldo.getX()+2);
//				}
//			}
//		});
//		
		
		waldo.setOnKeyPressed(event->{			
			if (event.getCode() == KeyCode.UP || event.getCode() == KeyCode.W) {
				waldo.setY(waldo.getY()-2);
			} else if (event.getCode() == KeyCode.DOWN || event.getCode() == KeyCode.S)  {
				waldo.setY(waldo.getY()+2);
			} else if (event.getCode() == KeyCode.LEFT|| event.getCode() == KeyCode.A) {
				waldo.setX(waldo.getX()-2);
			} else if (event.getCode() == KeyCode.RIGHT|| event.getCode() == KeyCode.D) {
				waldo.setX(waldo.getX()+2);
			}
		});
	
		p.getChildren().add(waldo);
		primaryStage.setTitle("Where's Waldo?");
		primaryStage.setScene(new Scene(p, 300, 300));
		primaryStage.show();
		waldo.requestFocus();

		
	}
	
	
	

}
