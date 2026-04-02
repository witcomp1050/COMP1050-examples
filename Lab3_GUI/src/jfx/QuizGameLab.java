package jfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class QuizGameLab extends Application {

    private int currentQuestion = 0;
    private int score = 0;

    // TODO:
    // 1. Create an array of 5 questions
    // 2. Create a 2D array for 4 choices per question
    // 3. Create an array for the correct answer index

    private Label questionLabel = new Label("Question will appear here");

    private RadioButton option1 = new RadioButton("Option 1");
    private RadioButton option2 = new RadioButton("Option 2");
    private RadioButton option3 = new RadioButton("Option 3");
    private RadioButton option4 = new RadioButton("Option 4");

    private ToggleGroup group = new ToggleGroup();

    private Button nextButton = new Button("Next");
    private Label resultLabel = new Label();

    @Override
    public void start(Stage primaryStage) {
        option1.setToggleGroup(group);
        option2.setToggleGroup(group);
        option3.setToggleGroup(group);
        option4.setToggleGroup(group);

        // TODO:
        // 4. Display the first question and its four answer choices
        // 5. Add an event handler to nextButton
        // 6. Check whether the selected answer is correct
        // 7. Update the score
        // 8. Move to the next question
        // 9. Show final score after the last question

        VBox root = new VBox(12,
                questionLabel,
                option1,
                option2,
                option3,
                option4,
                nextButton,
                resultLabel);

        root.setAlignment(Pos.CENTER);
        root.setPrefSize(500, 350);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Part 1c - Quiz Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
