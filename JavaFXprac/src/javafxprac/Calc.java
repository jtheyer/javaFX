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
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Calc extends Application {

    TextField tf1;

    @Override
    public void start(Stage primaryStage) {
        //Add title
        Label calcTitle = new Label("Simple Calculator");
        calcTitle.setStyle("-fx-padding: 10; -fx-font-size: 24; "
                + "-fx-text-fill: #ff0000;");

        HBox hBoxTitle = new HBox();
        hBoxTitle.setAlignment(Pos.CENTER);
        hBoxTitle.getChildren().add(calcTitle);
        
        //Add num pad
        GridPane numPad = new GridPane();
        numPad.setAlignment(Pos.CENTER);
        numPad.setStyle("-fx-hgap: 5; -fx-vgap: 5; -fx-padding: 10;");
        
        //Add calculation field 
        tf1 = new TextField();
        numPad.add(tf1, 0, 0);
        //Buttons on num Pad
        Button btZero = new Button();
        btZero.setText("1");
        btZero.setStyle("-fx-font-size: 16pt;");
        numPad.add(btZero, 1, 4);

        Button btOne = new Button();
        btOne.setText("1");
        btOne.setStyle("-fx-font-size: 16pt;");
        numPad.add(btOne, 0, 3);

        Button btTwo = new Button();
        btTwo.setText("2");
        btTwo.setStyle("-fx-font-size: 16pt;");
        numPad.add(btTwo, 1, 3);

        Button btThree = new Button();
        btThree.setText("3");
        btThree.setStyle("-fx-font-size: 16pt;");
        numPad.add(btThree, 2, 3);

        Button btFour = new Button();
        btFour.setText("4");
        btFour.setStyle("-fx-font-size: 16pt;");
        numPad.add(btFour, 0, 2);

        Button btFive = new Button();
        btFive.setText("5");
        btFive.setStyle("-fx-font-size: 16pt;");
        numPad.add(btFive, 1, 2);

        Button btSix = new Button();
        btSix.setText("6");
        btSix.setStyle("-fx-font-size: 16pt;");
        numPad.add(btSix, 2, 2);

        Button btSeven = new Button();
        btSeven.setText("7");
        btSeven.setStyle("-fx-font-size: 16pt;");
        numPad.add(btSeven, 0, 1);

        Button btEight = new Button();
        btEight.setText("8");
        btEight.setStyle("-fx-font-size: 16pt;");
        numPad.add(btEight, 1, 1);

        Button btNine = new Button();
        btNine.setText("9");
        btNine.setStyle("-fx-font-size: 16pt;");
        numPad.add(btNine, 2, 1);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(calcTitle);
        borderPane.setCenter(numPad);

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
