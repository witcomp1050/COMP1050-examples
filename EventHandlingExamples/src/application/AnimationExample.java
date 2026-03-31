package application;

import java.time.LocalDateTime;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationExample extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		Text text = new Text(50, 50, "");
		pane.setCenter(text);

		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Digital Clock");
		primaryStage.setScene(scene);
		primaryStage.show();

		EventHandler<ActionEvent> eH = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				final LocalDateTime dt = LocalDateTime.now();
				text.setText(String.format("%d:%02d:%02d %sM",
					dt.getHour()%12, dt.getMinute(),
					dt.getSecond(), dt.getHour()>=12?"P":"A"));
			}
		};

		Timeline a = new Timeline(new KeyFrame(Duration.millis(1000), eH));
		a.setCycleCount(Timeline.INDEFINITE);
		a.play();

		
	}

}
