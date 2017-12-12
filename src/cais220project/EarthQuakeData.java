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
    
    /**
     *
     */
    public EarthQuakeData(){
     location = new SimpleStringProperty();
     quakeTime = new SimpleObjectProperty<>();
     magnitude = new SimpleDoubleProperty();
     longitude = new SimpleDoubleProperty();
     latitude = new SimpleDoubleProperty();
     depth = new SimpleDoubleProperty();
    }

    /**
     *
     * @param location
     * @param quakeTime
     * @param magnitude
     * @param latitude
     * @param longitude
     * @param depth
     */
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
    
    /**
     *
     * @param location
     * @param quakeTime
     * @param magnitude
     */
    public EarthQuakeData(String location, 
            Date quakeTime,
            double magnitude) {
        this.location = new SimpleStringProperty(location);
        this.quakeTime = new SimpleObjectProperty<Date>(quakeTime);
        this.magnitude = new SimpleDoubleProperty(magnitude);
        this.longitude = new SimpleDoubleProperty(6.0);
        this.latitude = new SimpleDoubleProperty(5.0);
        this.depth =  new SimpleDoubleProperty(4.0);
     }
    
    /**
     *
     * @return
     */
    public String getLocation() {
        return location.get();
    }

    /**
     *
     * @param value
     */
    public void setLocation(String value) {
        location.set(value);
    }

    /**
     *
     * @return
     */
    public StringProperty locationProperty() {
        return location;
    }
    
    /**
     *
     * @return
     */
    public double getMagnitude() {
        return magnitude.get();
    }

    /**
     *
     * @param value
     */
    public void setMagnitude(double value) {
        magnitude.set(value);
    }

    /**
     *
     * @return
     */
    public DoubleProperty magnitudeProperty() {
        return magnitude;
    }
   
    /**
     *
     * @return
     */
    public Date getQuakeTime() {
        return quakeTime.get();
    }

    /**
     *
     * @param value
     */
    public void setQuakeTime(Date value) {
        quakeTime.set(value);
    }

    /**
     *
     * @return
     */
    public ObjectProperty<Date> quakeTimeProperty() {
        return quakeTime;
    }

    /**
     *
     * @return
     */
    public double getLongitude(){
        return longitude.get();
    }
    
    /**
     *
     * @param value
     */
    public void setLongitude(double value){
        longitude.set(value);
    }
    
    /**
     *
     * @return
     */
    public DoubleProperty longitudeProperty(){
        return longitude;
    }
    
    /**
     *
     * @return
     */
    public double getLatitude(){
        return latitude.get();
    }
    
    /**
     *
     * @param value
     */
    public void latitude(double value){
        latitude.set(value);
    }
    
    /**
     *
     * @return
     */
    public DoubleProperty latitudeProperty(){
        return latitude;
    }
    
    /**
     *
     * @return
     */
    public double getDepth(){
        return depth.get();
    }
    
    /**
     *
     * @param value
     */
    public void setDepth(double value){
        depth.set(value);
    }
    
    /**
     *
     * @return
     */
    public DoubleProperty depthProperty(){
        return depth;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "EarthQuakeData{" + "location=" + location + ", quakeTime=" + quakeTime + ", magnitude=" + magnitude + ", longitude=" + longitude + ", latitude=" + latitude + ", depth=" + depth + '}';
    }
    
    
}
