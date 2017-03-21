/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week8;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author 55heyerjt01
 */
public class C16N01 extends Application {

    private double paneWidth = 500;
    private double paneHeight = 150;

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(20, 40, "Programming is Fun");
        text.setFont(new Font("Times", 20));
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        paneForText.setStyle("-fx-border-color: gray");

        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbBlack = new RadioButton("Black");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbOrange = new RadioButton("Orange");

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbBlack.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbOrange.setToggleGroup(group);

        HBox hBox = new HBox(20);
        hBox.getChildren().addAll(rbRed, rbBlack, rbYellow, rbGreen, rbOrange);
        //hBox.setAlignment(Pos.CENTER);
        hBox.setStyle("-fx-border-color: red; -fx-padding: 10 0 20 50");

        Button btLeft = new Button("<=");
        Button btRight = new Button("=>");
        HBox hBoxForButton = new HBox(5);
        hBoxForButton.getChildren().addAll(btLeft, btRight);
        hBoxForButton.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox);
        borderPane.setCenter(paneForText);
        borderPane.setBottom(hBoxForButton);

        Scene scene = new Scene(borderPane, paneWidth, paneHeight);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

        //********************Start Event Handling Code***********************
        rbRed.setOnAction(e -> text.setStroke(Color.RED));
        rbBlack.setOnAction(e -> text.setStroke(Color.BLACK));
        rbYellow.setOnAction(e -> text.setStroke(Color.YELLOW));
        rbGreen.setOnAction(e -> text.setStroke(Color.GREEN));
        rbOrange.setOnAction(e -> text.setStroke(Color.ORANGE));

        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
