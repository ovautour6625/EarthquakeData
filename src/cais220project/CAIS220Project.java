/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu) 
 * (c) 2017
 * Created: Sep 20, 2017 9:23:05 AM 
 */
package cais220project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu)
 */
public class CAIS220Project extends Application {
  
  @Override
  public void start(Stage primaryStage) {
    Button btn = new Button();
    btn.setText("Say 'Hello World'");
    btn.setOnAction(new EventHandler<ActionEvent>() {
      
      @Override
      public void handle(ActionEvent event) {
        System.out.println("Hello World!");
      }
    });
    
    StackPane root = new StackPane();
    root.getChildren().add(btn);
    
    Scene scene = new Scene(root, 300, 250);
    
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
