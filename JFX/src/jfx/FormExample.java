package jfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
//import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
//import javafx.scene.layout.StackPane;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class FormExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Howdy!");

		GridPane grid = new GridPane();
//		 grid.setGridLinesVisible(true);
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text("Howdy :)");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);
		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);
		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);
		
		
		StackPane sp = new StackPane();
		Image img = new Image("https://witdirectoryphoto.z13.web.core.windows.net/folajimiy.jpg");
		ImageView imgView = new ImageView(img);
		
		VBox v = new VBox();
		v.getChildren().addAll(imgView, grid);
		
		

		

		Scene scene = new Scene(v);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		StackPane sp2 = new StackPane();
		Image img2 = new Image("https://www.crucial.com.au/blog/wp-content/uploads/2015/09/google.png");
		ImageView imgView2 = new ImageView(img2);
		sp2.getChildren().add(imgView2);

		Stage s2 = new Stage();
		
		s2.setScene(new Scene(sp2));
		
		s2.show();
		

		
	}
	
	

}
