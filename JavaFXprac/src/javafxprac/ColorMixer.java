/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxprac;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author 55heyerjt01
 */
public class ColorMixer extends Application {

    private TextField tfRed, tfGreen, tfBlue;
    private Rectangle rect;

    @Override
    public void start(Stage primaryStage) {

        Text txTitle = new Text("Color Mixer");
        txTitle.setStyle("-fx-font-size: 48pt;-fx-text-alignment: center;"
                + "-fx-fill: linear-gradient(from 0% 0% to 100% 100%, "
                + "blue 0%, green 25%, orange 50%, red 100%);");
        HBox hBoxTitle = new HBox();
        hBoxTitle.setAlignment(Pos.CENTER);
        hBoxTitle.getChildren().add(txTitle);

        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-hgap: 10; -fx-vgap: 10; -fx-padding: 20; -fx-alignment: center;");

        Label lbRed = new Label("Red");
        lbRed.setStyle("-fx-font-size: 18pt; -fx-text-fill: #ff0000;");
        gridPane.add(lbRed, 0, 0);

        tfRed = new TextField();
        tfRed.setPromptText("0 - 255");
        gridPane.add(tfRed, 1, 0);

        // TODO - add labels and text fields for green and blue
        Label lbGreen = new Label("Green");
        lbGreen.setStyle("-fx-font-size: 18pt; -fx-text-fill: #00ff00;");
        gridPane.add(lbGreen, 0, 1);

        tfGreen = new TextField();
        tfGreen.setPromptText("0 - 255");
        gridPane.add(tfGreen, 1, 1);

        Label lbBlue = new Label("Blue");
        lbBlue.setStyle("-fx-font-size: 18pt; -fx-text-fill: #0000ff;");
        gridPane.add(lbBlue, 0, 2);

        tfBlue = new TextField();
        tfBlue.setPromptText("0 - 255");
        gridPane.add(tfBlue, 1, 2);

        rect = new Rectangle(0, 0, 100, 100);

        Button btn = new Button();
        // TODO - finish the button commands
        btn.setText("Mix Colors");
        // when the button is clicked call the mixColors() method
        btn.setOnAction((ActionEvent e) -> mixColors());

        HBox hBoxBtn = new HBox();
        hBoxBtn.setAlignment(Pos.CENTER);
        hBoxBtn.setSpacing(20);
        hBoxBtn.getChildren().addAll(rect, btn);

        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-padding: 20;");
        borderPane.setTop(hBoxTitle);
        borderPane.setCenter(gridPane);
        borderPane.setBottom(hBoxBtn);

        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("Color Mixer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void mixColors() {
        int r = Integer.parseInt(tfRed.getText()),
                g = Integer.parseInt(tfGreen.getText()),
                b = Integer.parseInt(tfBlue.getText());
        // TODO - get the integer color values from the text fields 

        rect.setFill(Color.rgb(r, g, b));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
