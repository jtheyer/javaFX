/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author 55heyerjt01
 */
public class Pick4Cards extends Application {

    @Override
    public void start(Stage primaryStage) {
        List<Integer> list = new ArrayList();
        for (int i = 1; i <= 52; i++) {
            list.add(i);
        }
        java.util.Collections.shuffle(list);//remember this*********************

        HBox hBox = new HBox(5); //Horizontal box that i can place node objects;;
        hBox.setAlignment(Pos.CENTER);
        for (int i = 0; i < 5; i++) {
            hBox.getChildren().add(new ImageView("image/card/" + list.get(i) + ".png"));
            //getChildren() adds nodes then add a new image view to create file.
        }
        Button btRefresh = new Button("Refresh");
        btRefresh.setOnAction((ActionEvent e) -> {
            java.util.Collections.shuffle(list);
            hBox.getChildren().clear();
            for (int i = 1; i < 5; i++) {
                hBox.getChildren().add(new ImageView("image/card/" + list.get(i) + ".png"));
            }
        }); 
        
        HBox hBoxBtn = new HBox(5);//Distance from button to other panes(He believes)
        hBoxBtn.getChildren().add(btRefresh);
        hBoxBtn.setAlignment(Pos.CENTER);
        hBoxBtn.setPadding(new Insets(5,5,20,5));
        
        BorderPane pane = new BorderPane();
        pane.setCenter(hBox);//*************Usually majority of activity centered in Pane
        pane.setBottom(hBoxBtn);
        BorderPane.setAlignment(hBox, Pos.TOP_CENTER);
        
        Scene scene = new Scene(pane, 500, 350);

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
