/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author 2472557
 */
public class JavaApplication3 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Label NumberOfDays = new Label("Number of days:");
        grid.add(NumberOfDays, 0, 0);
        
        TextField textnbOfDays = new TextField();
        grid.add(textnbOfDays, 0, 1);
        
        Label Airfare = new Label("Amount of airfare:");
        grid.add(Airfare, 0, 2);
        
        TextField airfare = new TextField();
        grid.add(airfare, 0, 3);
        
        Label milesDriven =  new Label("Number of miles driven");
        grid.add(milesDriven, 0, 4);
        
        TextField miles = new TextField();
        grid.add(miles, 0, 5);
        
        Label ParkingFees = new Label("Amount of parking fees");
        grid.add(ParkingFees, 0, 6);
        
        TextField parking = new TextField();
        grid.add(parking, 0, 7);
        
        Label TaxiCharges = new Label("Amount of taxi charges");
        grid.add(TaxiCharges, 0, 8);
        
        TextField taxi = new TextField();
        grid.add(taxi, 0, 9);
        
        Label seminarFees = new Label("Conference or seminar registration fees");
        grid.add(seminarFees, 0, 10);
        
        TextField seminar = new TextField();
        grid.add(seminar, 0, 11);
        
        Label LodgingCharges = new Label("Lodging charges, per night");
        grid.add(LodgingCharges, 0, 12);
        
        TextField lodging = new TextField();
        grid.add(lodging, 0, 13);
        
        Scene scene = new Scene(grid, 500, 500);
        stage.setScene(scene);
        
        stage.show();
    }
    
}
