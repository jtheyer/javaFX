/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxprac;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author 55heyerjt01
 */
public class ExpenseCalculator extends Application {
   
    private TextField tfRent, tfUts, tfFood, tfOther, tfTotal;

    @Override
    public void start(Stage primaryStage) {

        Text txTitle = new Text("Expense Calculator");
        txTitle.setStyle("-fx-font-size: 28pt;");
        HBox hBoxTitle = new HBox();
        hBoxTitle.setAlignment(Pos.CENTER);
        hBoxTitle.getChildren().add(txTitle);

        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-hgap: 10; -fx-vgap: 10; -fx-padding: 20; -fx-alignment: center;");

        Label lbMonth = new Label("Month Name");
        lbMonth.setStyle("-fx-font-size: 14pt;");
        gridPane.add(lbMonth, 0, 0);

        // TODO - add the remaining months
        ObservableList<String> options = FXCollections.observableArrayList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
        final ComboBox comboBox = new ComboBox(options);
        gridPane.add(comboBox, 1, 0);

        Label lbRent = new Label("Rent");
        lbRent.setStyle("-fx-font-size: 14pt;");
        gridPane.add(lbRent, 0, 1);

        tfRent = new TextField();
        tfRent.setAlignment(Pos.BASELINE_RIGHT);
        gridPane.add(tfRent, 1, 1);

        //TODO - add labels and text fields for utilities, food, and other
        Label lbUts = new Label("Utilities");
        lbUts.setStyle("-fx-font-size: 14pt;");
        gridPane.add(lbUts, 0, 2);

        tfUts = new TextField();
        tfUts.setAlignment(Pos.BASELINE_RIGHT);
        gridPane.add(tfUts, 1, 2);

        Label lbFood = new Label("Food");
        lbFood.setStyle("-fx-font-size: 14pt;");
        gridPane.add(lbFood, 0, 3);

        tfFood = new TextField();
        tfFood.setAlignment(Pos.BASELINE_RIGHT);
        gridPane.add(tfFood, 1, 3);

        Label lbOther = new Label("Other Expenses");
        lbOther.setStyle("-fx-font-size: 14pt;");
        gridPane.add(lbOther, 0, 4);

        tfOther = new TextField();
        tfOther.setAlignment(Pos.BASELINE_RIGHT);
        gridPane.add(tfOther, 1, 4);

        Label lbTotal = new Label("Total");
        lbTotal.setStyle("-fx-font-size: 14pt;");
        gridPane.add(lbTotal, 0, 5);

        tfTotal = new TextField();
        tfTotal.setAlignment(Pos.BASELINE_RIGHT);
        tfTotal.setEditable(false);
        gridPane.add(tfTotal, 1, 5);

        Button btnCalculate = new Button();
        btnCalculate.setText("Calculate");
        btnCalculate.setStyle("-fx-font-size: 16pt; -fx-padding: 10; -fx-text-fill: #ff0000;");
        btnCalculate.setOnAction((ActionEvent e) -> calculate());

        Button btnClear = new Button();
        // TODO - add a button that when pressed will clear each of the numeric text fields
        btnClear.setText("Clear");
        btnClear.setStyle("-fx-font-size: 16pt; -fx-padding: 10; -fx-text-fill: #000000;");
        btnClear.setOnAction((ActionEvent e) -> {
            tfUts.clear();
            tfRent.clear();
            tfFood.clear();
            tfOther.clear();
            tfTotal.clear();
        });

        HBox hBoxBtn = new HBox();
        hBoxBtn.setAlignment(Pos.CENTER);
        hBoxBtn.setSpacing(20);
        hBoxBtn.getChildren().addAll(btnClear, btnCalculate);

        BorderPane borderPane = new BorderPane();
        // TODO - add hBoxTitle, gridPane, and hBoxBtn to the borderPane
        borderPane.setStyle("-fx-padding: 20;");
        borderPane.setTop(hBoxTitle);
        borderPane.setCenter(gridPane);
        borderPane.setBottom(hBoxBtn);

        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("Monthly Expenses");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculate() {
        double rent, uts, food, other, total;

        // TODO - check that each text field has a value and if not then set to 0.00
        if (tfRent.getText().equals("")) {
            tfRent.setText("0.00");
        }
        if (tfUts.getText().equals("")) {
            tfUts.setText("0.00");
        }
        if (tfFood.getText().equals("")) {
            tfFood.setText("0.00");
        }
        if (tfOther.getText().equals("")) {
            tfOther.setText("0.00");
        }
        // TODO - read in each text field as a double
        rent = Double.parseDouble(tfRent.getText());
        uts = Double.parseDouble(tfUts.getText());
        food = Double.parseDouble(tfFood.getText());
        other = Double.parseDouble(tfOther.getText());
        // TODO - calculate the total expenses and display with 2 decimal places
        total = rent + uts + food + other;
        tfTotal.setText(String.format("%.2f", total));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
