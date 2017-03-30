/**
 *
 * @author jason
 */
package javafxprac;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Calc extends Application {
    int one = 1; int two = 2; int three = 3;int four = 4;int five = 5; 
    @Override
    public void start(Stage primaryStage) {
        Label calcTitle = new Label("Simple Calculator");
        calcTitle.setStyle("-fx-font-size: 16px; -fx-text-fill: #0000ff");
        
        
        GridPane gridPane = new GridPane(); 
        gridPane.setStyle("-fx-padding:10px;");
        
        
       BorderPane borderPane = new BorderPane();
       borderPane.setStyle("-fx-padding: 20px;");
       borderPane.setTop(calcTitle);
        
        Scene scene = new Scene(borderPane, 300, 450);
        primaryStage.setTitle("Simple Calculator");
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
