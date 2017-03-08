/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author jason
 */
public class RotateImg extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle rect = new Rectangle();
        rect.setWidth(120);
        rect.setHeight(80);
        rect.setX(100);
        rect.setY(100);
        rect.setFill(Color.ORANGE);
        
        HBox hBox = new HBox(5);
        hBox.setAlignment(Pos.CENTER);
        Pane pane = new Pane(); 
        
        Button rotate = new Button("Rotate");
        rotate.setOnAction((ActionEvent e) -> {
            rect.setRotate(45);
        });

        pane.getChildren().add(rotate);
        pane.getChildren().add(rect);
        Scene scene = new Scene(pane, 300, 250);

        primaryStage.setTitle("Rotate Button");
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
