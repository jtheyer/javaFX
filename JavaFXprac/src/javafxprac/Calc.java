/**
 *
 * @author jason
 */
package javafxprac;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Calc extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label calcTitle = new Label("Simple Calculator");
        calcTitle.setStyle("-fx-padding: 10; -fx-font-size: 24; "
                + "-fx-text-fill: #00ff00;");
        
        HBox hBoxTitle = new HBox();
        hBoxTitle.setAlignment(Pos.CENTER);
        hBoxTitle.getChildren().add(calcTitle);
        
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-hgap: 5; -fx-vgap: 5; -fx-padding: 10;");  
        
        Button btOne = new Button();
        btOne.setText("1");
        btOne.setStyle("-fx-font-size: 16pt;");
        gridPane.add(btOne, 0, 0);
        
//        Button btTwo = new Button();
//        btOne.setText("2");
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(calcTitle);
        borderPane.setCenter(gridPane);
        
        Scene scene = new Scene(borderPane);
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
