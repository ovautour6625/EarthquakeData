/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cais220project;

import java.util.Date;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Owen
 */
public class EarthQuakeData {
 private final StringProperty location;
    private final ObjectProperty<Date> quakeTime;
    private final DoubleProperty magnitude;
   private final DoubleProperty longitude;
    private final DoubleProperty latitude;
    private final DoubleProperty depth;
    
    public EarthQuakeData(){
     location = new SimpleStringProperty();
     quakeTime = new SimpleObjectProperty<>();
     magnitude = new SimpleDoubleProperty();
     longitude = new SimpleDoubleProperty();
     latitude = new SimpleDoubleProperty();
     depth = new SimpleDoubleProperty();
    }

    public EarthQuakeData(String location, 
            Date quakeTime,
            double magnitude,
            double latitude, double longitude, double depth) {
        this.location = new SimpleStringProperty(location);
        this.quakeTime = new SimpleObjectProperty<Date>(quakeTime);
        this.magnitude = new SimpleDoubleProperty(magnitude);
        this.latitude = new SimpleDoubleProperty(latitude);
        this.longitude = new SimpleDoubleProperty(longitude);
        this.depth = new SimpleDoubleProperty(depth);
    }
    
    
    public String getLocation() {
        return location.get();
    }

    public void setLocation(String value) {
        location.set(value);
    }

    public StringProperty locationProperty() {
        return location;
    }
    
   

    public double getMagnitude() {
        return magnitude.get();
    }

    public void setMagnitude(double value) {
        magnitude.set(value);
    }

    public DoubleProperty magnitudeProperty() {
        return magnitude;
    }
   

    public Date getQuakeTime() {
        return quakeTime.get();
    }

    public void setQuakeTime(Date value) {
        quakeTime.set(value);
    }

    public ObjectProperty<Date> quakeTimeProperty() {
        return quakeTime;
    }

    public double getLongitude(){
        return longitude.get();
    }
    
    public void setLongitude(double value){
        longitude.set(value);
    }
    
    public DoubleProperty longitudeProperty(){
        return longitude;
    }
    
     public double getLatitude(){
        return latitude.get();
    }
    
    public void latitude(double value){
        latitude.set(value);
    }
    
    public DoubleProperty latitudeProperty(){
        return latitude;
    }
    
     public double getDepth(){
        return depth.get();
    }
    
    public void setDepth(double value){
        depth.set(value);
    }
    
    public DoubleProperty depthProperty(){
        return depth;
    }

    @Override
    public String toString() {
        return "EarthQuakeData{" + "location=" + location + ", quakeTime=" + quakeTime + ", magnitude=" + magnitude + ", longitude=" + longitude + ", latitude=" + latitude + ", depth=" + depth + '}';
    }
    
    
}
