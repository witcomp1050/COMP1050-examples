package application;

import javafx.application.Application;
import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.util.Duration;


public class AnimationAndMedia extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	    MediaPlayer player;



	    @Override
	    public void start(Stage primaryStage) {
	        Button b = new Button("pause");
	        b.setLayoutX(20);
	        b.setLayoutY(20);

	        b.setOnAction(event -> {
	            if (player != null && player.getStatus() == Status.PAUSED) {
	                player.play();
	                b.setText("pause");
	            } else if (player != null) {
	                player.pause();
	                b.setText("play!");
	            }
	        });

	        Pane root = new Pane();
	        root.setPrefSize(800, 500);

	        Group flag = createAmericanFlag(200, 120);
	        flag.setLayoutX(250);
	        flag.setLayoutY(120);

	        animateFlag(flag);

	        root.getChildren().addAll(flag, b);

	        var url = getClass().getResource("/application/america.mp3");
	        if (url == null) {
	            throw new RuntimeException("Could not find /application/america.mp3");
	        }

	        Media media = new Media(url.toExternalForm());
	        player = new MediaPlayer(media);
	        player.play();

	        primaryStage.setScene(new Scene(root, 800, 500));
	        primaryStage.setTitle("American Flag Animation");
	        primaryStage.show();
	    }

	    private Group createAmericanFlag(double width, double height) {
	        Group flag = new Group();

	        double stripeHeight = height / 13.0;

	        // 13 stripes
	        for (int i = 0; i < 13; i++) {
	            Rectangle stripe = new Rectangle(0, i * stripeHeight, width, stripeHeight);
	            stripe.setFill(i % 2 == 0 ? Color.RED : Color.WHITE);
	            flag.getChildren().add(stripe);
	        }

	        // Blue canton
	        double cantonWidth = width * 0.4;
	        double cantonHeight = stripeHeight * 7;
	        Rectangle canton = new Rectangle(0, 0, cantonWidth, cantonHeight);
	        canton.setFill(Color.DARKBLUE);
	        flag.getChildren().add(canton);

	        // Simple stars as circles
	        int rows = 5;
	        int cols = 6;
	        double xGap = cantonWidth / (cols + 1);
	        double yGap = cantonHeight / (rows + 1);

	        for (int r = 1; r <= rows; r++) {
	            for (int c = 1; c <= cols; c++) {
	                Circle star = new Circle(c * xGap, r * yGap, 4, Color.WHITE);
	                flag.getChildren().add(star);
	            }
	        }

	        // Border
	        Rectangle border = new Rectangle(0, 0, width, height);
	        border.setFill(Color.TRANSPARENT);
	        border.setStroke(Color.BLACK);
	        flag.getChildren().add(border);

	        return flag;
	    }

	    private void animateFlag(Group flag) {
	        TranslateTransition floatAnim = new TranslateTransition(Duration.seconds(2), flag);
	        floatAnim.setFromY(0);
	        floatAnim.setToY(10);
	        floatAnim.setAutoReverse(true);
	        floatAnim.setCycleCount(Animation.INDEFINITE);

	        RotateTransition waveAnim = new RotateTransition(Duration.seconds(2.5), flag);
	        waveAnim.setFromAngle(-2);
	        waveAnim.setToAngle(2);
	        waveAnim.setAutoReverse(true);
	        waveAnim.setCycleCount(Animation.INDEFINITE);

	        floatAnim.play();
	        waveAnim.play();
	    }
	
	
	

}
