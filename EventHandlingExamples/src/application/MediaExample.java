package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.stage.Stage;

public class MediaExample extends Application {

    MediaPlayer player;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button b = new Button("pause");
        
        StackPane sp = new StackPane(b);

        var url = getClass().getResource("/application/america.mp3");
        if (url == null) {
            throw new RuntimeException("Could not find /application/america.mp3");
        }
//
        Media media = new Media(url.toExternalForm());
        player = new MediaPlayer(media);
        player.play();

        b.setOnAction(event -> {
            if (player != null && player.getStatus() == Status.PAUSED) {
                player.play();
                b.setText("pause");
            } else if (player != null) {
                player.pause();
                b.setText("play!");
            }
        });


        

        primaryStage.setScene(new Scene(sp, 300, 200));
        primaryStage.show();
    }
}