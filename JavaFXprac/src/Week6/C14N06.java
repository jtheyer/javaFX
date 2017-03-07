/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author 55heyerjt01
 */
public class C14N06 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        for (int row = 0; row < 8; row++) {
            boolean isWhite = row % 2 == 0;
            for (int col = 0; col < 8; col++) {
                Rectangle rect = new Rectangle(25 + row * 50, 25 + col * 50, 50, 50);
                if (isWhite) {
                    rect.setFill(Color.GREEN);
                } else {
                    rect.setFill(Color.GRAY);
                }
                isWhite = !isWhite;
                pane.getChildren().add(rect);//getChildren() makes list of objects that
                //are on the pane.. then adds the rect object (in this case)
            }
        }

        Scene scene = new Scene(pane, 450, 450);

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
