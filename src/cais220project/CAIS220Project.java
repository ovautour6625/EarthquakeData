/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu) 
 * (c) 2017
 * Created: Sep 20, 2017 9:23:05 AM 
 */
package cais220project;

import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu)
 */
public class CAIS220Project extends Application {
  
  @Override
  public void start(Stage primaryStage) {
     
      BorderPane borderpane = new BorderPane();
      GridPane grid = new GridPane();
      grid.setPadding(new Insets(20,0,10,10));
      grid.setVgap(10);
      grid.setHgap(10);
      borderpane.setLeft(grid);
      
      Text magnitude = new Text("Magnitude: ");
      grid.add(magnitude, 0 , 0);
      ObservableList<String> magoptions = 
                    FXCollections.observableArrayList(
                    "4.5 and above",
                    "2.5 and above",
                    "1.0 and above",
                    "Show All"
                    );
        ComboBox magbox = new ComboBox(magoptions);
        grid.add(magbox, 0, 1);

        Text when = new Text("When: ");
        grid.add(when, 0, 2);
        ObservableList<String> whenoptions =
                       FXCollections.observableArrayList(
                       "Past 30 Days",
                       "Past Week",
                       "Past Day"
                       );
        ComboBox whenbox = new ComboBox(whenoptions);
        grid.add(whenbox, 0 , 3);

        Button show = new Button("Show");
        grid.add(show, 0 , 4);
        

        EarthQuakeDataFactory factory = new GeoJSONEarthQuakeDataFactory();
        List<EarthQuakeData> data = factory.getData();

        EarthQuakeTableView tableView = new EarthQuakeTableView(
                FXCollections.observableArrayList(data)
        );

        borderpane.setCenter(tableView);
        Scene scene = new Scene(borderpane, 750, 250);
        primaryStage.setTitle("USGS EarthQuake Data");
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
