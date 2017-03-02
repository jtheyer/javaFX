/** 
 * Page 578 #14.4
 * Color and Font: Write a program that displays five texts vertically, as 
 * shown in book. Set a random color and opacity for each text and set the font
 * of each text to 'times roman', bold, italic, and 22px.
 *
 * @author Jason Heyer
 */
package Week6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author 55heyerjt01
 */
public class ColorAndFont extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       HBox pane = new HBox();
       pane.setAlignment(Pos.CENTER);
       
       Font font = Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
       
       for(int i = 0; i < 5; i++){
           Text txt = new Text("Jason");
           txt.setRotate(180);
           txt.setFont(font);
           txt.setFill(new Color(Math.random(),Math.random(),Math.random(),Math.random()));
           pane.getChildren().add(txt);
       }
       Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Hello World!");
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
