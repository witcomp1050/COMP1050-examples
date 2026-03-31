package javafxEx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleExample extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();

		final Circle c = new Circle();
		c.setCenterX(100);
		c.setCenterY(100);
		c.setRadius(50);
		c.setStroke(Color.RED);
		c.setFill(Color.BLUE);

		c.centerXProperty().bind(pane.widthProperty().divide(2));
		c.centerYProperty().bind(pane.heightProperty().divide(2));
//		primaryStage.setResizable(false);
		
		pane.getChildren().add(c);

		Scene scene = new Scene(pane, 300, 600);
		primaryStage.setTitle("Circle!");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Stage s2 = new Stage();
		
		s2.setScene(new Scene(new StackPane(new Button("new window")), 200, 200));
		s2.setTitle("Window 2");
		s2.show();
	}

}
