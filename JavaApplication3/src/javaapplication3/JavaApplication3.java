package javaapplication1;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author 2472557
 */
public class JavaApplication1 extends Application{

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
        
        Label Airfare = new Label("Amount of airfare ($):");
        grid.add(Airfare, 0, 2);
        
        TextField airfare = new TextField();
        grid.add(airfare, 0, 3);
        
        Label carFees = new Label("Amout of car rental fees, if any ($):");
        grid.add(carFees, 0, 4);
        
        TextField car = new TextField();
        grid.add(car, 0, 5);
        
        Label milesDriven =  new Label("Number of miles driven ($):");
        grid.add(milesDriven, 0, 6);
        
        TextField miles = new TextField();
        grid.add(miles, 0, 7);
        
        Label ParkingFees = new Label("Amount of parking fees ($):");
        grid.add(ParkingFees, 0, 8);
        
        TextField parking = new TextField();
        grid.add(parking, 0, 9);
        
        Label TaxiCharges = new Label("Amount of taxi charges ($):");
        grid.add(TaxiCharges, 0, 10);
        
        TextField taxi = new TextField();
        grid.add(taxi, 0, 11);
        
        Label seminarFees = new Label("Conference or seminar registration fees ($):");
        grid.add(seminarFees, 0, 12);
        
        TextField seminar = new TextField();
        grid.add(seminar, 0, 13);
        
        Label LodgingCharges = new Label("Lodging charges, per night ($):");
        grid.add(LodgingCharges, 0, 14);
        
        TextField lodging = new TextField();
        grid.add(lodging, 0, 15);
        
        Button btn = new Button("Calculate");
        grid.add(btn, 0, 16);
        
        final Text actiontarget0 = new Text();
        grid.add(actiontarget0, 0, 17);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 0, 17);
        
        final Text actiontarget2 = new Text();
        grid.add(actiontarget2, 0, 18);
        
        final Text actiontarget3 = new Text();
        grid.add(actiontarget3, 0, 19);
        
        final Text actiontarget4 = new Text();
        grid.add(actiontarget4, 0, 20);
        
        btn.setOnMouseClicked((MouseEvent event) -> {
            
            int days = Integer.parseInt(textnbOfDays.getText());
            double airfareFees = Double.parseDouble(airfare.getText());
            double carRental = Double.parseDouble(car.getText());
            double milesFees = Double.parseDouble(miles.getText());
            double parkingFees = Double.parseDouble(parking.getText());
            double taxiFees = Double.parseDouble(taxi.getText());
            double conferenceFees = Double.parseDouble(seminar.getText());
            double lodgingPerNight = Double.parseDouble(lodging.getText());
                        
            double meals = days * 37;
            double lodgingTotal = lodgingPerNight * days;
            double milesCost = milesFees * 0.27;
            double TotalCost = airfareFees + carRental + milesCost + parkingFees + taxiFees + conferenceFees + meals + lodgingTotal;
                    
            double allowedParking = Math.min(parkingFees, days * 10);
            double allowedTaxi = Math.min(taxiFees, days * 20);
            double allowedLodging = Math.min(lodgingPerNight, 95) * days;
            double allowedTotal = airfareFees + carRental + milesCost + allowedParking + allowedTaxi + conferenceFees + allowedLodging + meals;
            
            double excess = Math.max(0, TotalCost - allowedTotal);
            double savings = Math.max(0, allowedTotal - TotalCost);
            
            if(days < 0 || airfareFees < 0 || carRental < 0 || milesFees < 0 || parkingFees < 0 || taxiFees < 0 || conferenceFees < 0 || lodgingPerNight < 0) {
                actiontarget0.setText("Wrong input");
                
                return;
            }
           
            
            actiontarget.setText("Total Expenses: " + TotalCost);
            actiontarget2.setText("Total allowable expenses: " + allowedTotal);
            actiontarget3.setText("Excess amount: " + excess);
            actiontarget4.setText("Amount saved by the company: " + savings);
            
            
        });
        
        Scene scene = new Scene(grid, 400, 800);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene);
        
        stage.show();
    }
    
}
