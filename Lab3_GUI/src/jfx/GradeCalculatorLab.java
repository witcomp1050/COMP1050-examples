package jfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GradeCalculatorLab extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label titleLabel = new Label("Grade Calculator");

        TextField assignmentField = new TextField();
        assignmentField.setPromptText("Assignments");

        TextField quizField = new TextField();
        quizField.setPromptText("Quizzes");

        TextField midtermField = new TextField();
        midtermField.setPromptText("Midterm");

        TextField finalField = new TextField();
        finalField.setPromptText("Final Exam");

        Button calculateButton = new Button("Calculate");
        Label resultLabel = new Label();

        // TODO:
        // 1. Add an event handler to calculateButton
        // 2. Read values from all text fields
        // 3. Validate empty input
        // 4. Validate numeric input using try-catch
        // 5. Validate range 0 to 100
        // 6. Compute weighted final grade
        // 7. Determine letter grade
        // 8. Determine pass/fail
        // 9. Display the result in resultLabel

        VBox root = new VBox(10,
                titleLabel,
                assignmentField,
                quizField,
                midtermField,
                finalField,
                calculateButton,
                resultLabel);

        root.setAlignment(Pos.CENTER);
        root.setPrefSize(400, 350);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Part 1b - Grade Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
 
