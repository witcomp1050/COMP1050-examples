package jfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleEx extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage s1) throws Exception {
		final Circle c = new Circle();
		c.setCenterX(100);
		c.setCenterY(100);
		c.setRadius(50);
		c.setStroke(Color.YELLOW);
		c.setFill(Color.BLUE);

		Pane pane = new Pane();
		pane.getChildren().add(c);

		Scene scene = new Scene(pane, 200, 200);
		s1.setTitle("Circle!");
		s1.setScene(scene);
//		s1.setResizable(false);
		
		c.centerXProperty().bind(pane.widthProperty().divide(2));
		c.centerYProperty().bind(pane.heightProperty().divide(2));
		
		
		s1.show();

		
	}

}
