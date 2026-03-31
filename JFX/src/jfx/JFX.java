package jfx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class JFX extends Application{
	public static void main(String[] args) {
		System.out.println("hello world");
		launch(args);
	}

	@Override
	public void start(Stage s) throws Exception {
		System.out.println("hello world again!");		
		s.setWidth(300);
		s.setHeight(600);
		s.setTitle("My JavaFX Project");
		Button b1 = new Button("Click me!");
		
		Text t = new Text ("hello JavaFX");
		
		VBox sp = new VBox();
		
//		sp.getChildren().add(b1);
//		sp.getChildren().add(t);
		
		sp.getChildren().addAll(t,b1);
		
		Scene sc1 = new Scene(sp);
		
		
//		Scene sc1 = new Scene(new StackPane(new Button("Click me!")));
		
		
		
		
		
		
		s.setScene(sc1);
		
		s.show();
		
		Stage s2 = new Stage();		
	
		 Text text = new Text(10, 40, "Hello World!");
		 text.setFont(new Font(40));
		 Pane p = new Pane(text);
		 
//		 Scene scene = new Scene(new Group(text));
		 
		 Scene sc2 = new Scene(p);


		 s2.setTitle("Welcome to JavaFX stage 2!"); 
		 s2.setScene(sc2); 
		 s2.sizeToScene(); 
		 s2.show(); 


		
	}

}
