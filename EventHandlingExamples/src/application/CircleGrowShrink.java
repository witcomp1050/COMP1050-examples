package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class CircleGrowShrink extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		try {			
			
			Circle c = new Circle(50);
			
			c.setStroke(Color.BLACK);
			c.setFill(Color.BLUE);
			
			Button enlarge = new Button("Enlarge");
			
//			enlarge.setOnAction(new EventHandler<ActionEvent>() {
//				@Override
//				public void handle(ActionEvent event) {
//					c.setRadius(c.getRadius()+3);
//				}
//			});
//////			
			
			enlarge.setOnAction(e->{
				c.setRadius(c.getRadius()+3);
			});
//			
			Button shrink = new Button("Shrink");
//			shrink.setOnAction(new EventHandler<ActionEvent>() {
//				@Override
//				public void handle(ActionEvent event) {
//					c.setRadius(c.getRadius()-3);
//				}
//			});
			
			
			shrink.setOnAction(e->{
				c.setRadius(c.getRadius()-3);
			});

			HBox hb = new HBox();
			hb.getChildren().addAll(enlarge, shrink);
//			hb.getChildren().add(shrink);
			hb.setSpacing(10);
			hb.setPadding(new Insets(10));
			hb.setAlignment(Pos.CENTER);
			
			VBox vb = new VBox();
			vb.getChildren().add(c);
			vb.getChildren().add(hb);
			vb.setAlignment(Pos.CENTER);

			primaryStage.setTitle("Circle");
			primaryStage.setScene(new Scene(vb, 400, 400));
			primaryStage.show();

			
			
//			
//			
//			StackPane root = (StackPane)FXMLLoader.load(getClass().getResource("EventHandling.fxml"));
//			
			
//			
//			Scene scene = new Scene(vb,400,400);
//			
////			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			
//					
//			primaryStage.setScene(scene);
//			primaryStage.show();
//			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
