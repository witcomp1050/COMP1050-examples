package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
//import javafx.scene.control;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class LoginFormLab extends Application{

	@Override
    public void start(Stage primaryStage) {
        Label titleLabel = new Label("Login Form");
        Label userLabel = new Label("Username:");
        TextField userField = new TextField();

        Label passLabel = new Label("Password:");
        PasswordField passField = new PasswordField();

        Button loginButton = new Button("Login");
        Label messageLabel = new Label();

        // TODO:
        // 1. Add an event handler to loginButton
        // 2. Read the values from userField and passField
        // 3. Check for blank fields
        // 4. Accept username = admin and password = javafx123
        // 5. Update messageLabel with the result

        VBox root = new VBox(10, titleLabel, userLabel, userField, passLabel, passField, loginButton, messageLabel);
        root.setAlignment(Pos.CENTER);
        root.setPrefSize(350, 300);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Part 1a - Login Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
	
	

}
