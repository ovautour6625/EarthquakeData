/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cais220project;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.beans.property.SimpleStringProperty;

import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;

import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

/**
 *
 * @author Owen
 */
public class EarthQuakeTableView extends TableView<EarthQuakeData> {
 
    public EarthQuakeTableView() {
    setColumns();
  }

  public EarthQuakeTableView(ObservableList<EarthQuakeData> items) {
    super(items);
    setColumns();
  }

  private void setColumns() {
    TableColumn locationColumn = new TableColumn("Location");
    locationColumn.setMinWidth(50);
    locationColumn.setCellValueFactory(
      new PropertyValueFactory<EarthQuakeData, 
              String>("location"));

    TableColumn magnitudeColumn = 
      new TableColumn("Magnitude");
    magnitudeColumn.setMinWidth(10);
    magnitudeColumn.setCellValueFactory(
      new PropertyValueFactory<EarthQuakeData, Double>("magnitude"));

    TableColumn quakeTimeColumn = new TableColumn("Earthquake time");
    quakeTimeColumn.setMinWidth(50);
    //quakeTimeColumn.setCellValueFactory(new PropertyValueFactory<EarthquakeData, 
    //          String>("quakeTime"));
    quakeTimeColumn.setCellValueFactory(
      new Callback<CellDataFeatures<EarthQuakeData, String>, 
              ObservableValue<String>>() {
      @Override
      public ObservableValue<String> call(
              CellDataFeatures<EarthQuakeData, String> param) {
        SimpleDateFormat dateFormat = new 
        SimpleDateFormat("YYYY-MM-dd");
        String quakeDate = dateFormat.format(
                param.getValue().getQuakeTime());
        return new SimpleStringProperty(quakeDate);
      }
    });
    
    TableColumn longColumn = new TableColumn("Longitude");
    longColumn.setMinWidth(10);
    longColumn.setCellValueFactory(
            new PropertyValueFactory<EarthQuakeData,Double>("longitude"));
    
      TableColumn latColumn = new TableColumn("Latitude");
    latColumn.setMinWidth(10);
    latColumn.setCellValueFactory(
            new PropertyValueFactory<EarthQuakeData, Double>("latitude"));
    
    
      TableColumn depthColumn = new TableColumn("Depth");
    depthColumn.setMinWidth(20);
    depthColumn.setCellValueFactory(
            new PropertyValueFactory<EarthQuakeData, Double>("depth"));
    
    
    
    this.getColumns().addAll(locationColumn, magnitudeColumn, 
            quakeTimeColumn, longColumn, latColumn, depthColumn);
  }

}
