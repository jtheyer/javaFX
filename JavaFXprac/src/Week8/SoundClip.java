package Week8;
/**
 * Play an audio Clip.
 */
import java.applet.AudioClip;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class SoundClip extends Application {
    
    //AudioClip audioClip = new AudioClip("http://www.cs.armstrong.edu/liang/common/audio/anthem/anthem2.mp3");
    MediaPlayer mp = new MediaPlayer(
            new Media("http://www.cs.armstrong.edu/liang/common/sample.mp4"));
    @Override
    public void start(Stage primaryStage) {
        MediaView mediaView = new MediaView(mp);
        Button btn = new Button(">");
        btn.setOnAction((ActionEvent event) -> {
            if(btn.getText().equals(">")){
                mp.play();
                btn.setText("||");
            }else {
                mp.pause();
                btn.setText(">");
            }
        });
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(mediaView);
        borderPane.setBottom(btn);
        
        Scene scene = new Scene(borderPane, 650, 650);
        
        primaryStage.setTitle("MediaView");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
