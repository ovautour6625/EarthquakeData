/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cais220project;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.geojson.Feature;
import org.geojson.FeatureCollection;
import org.geojson.Geometry;
import org.geojson.GeometryCollection;
import org.geojson.LngLatAlt;
import org.geojson.Point;

/**
 *
 * @author Owen
 */
public class GeoJSONEarthQuakeDataFactory extends EarthQuakeDataFactory{

    static private final String LOCATION_KEY = "place";
    static private final String MAGNITUDE_KEY = "mag";
    static private final String QUAKETIME_KEY= "time";
    
    
    @Override
    public List<EarthQuakeData> getData() {
       
        try{
            
            URL url = new URL("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_month.geojson");
            ArrayList<EarthQuakeData> list = null;
            try(
                    InputStream in = url.openStream();
                    )
            {
                FeatureCollection featureCollection =
                        new ObjectMapper().readValue(in, FeatureCollection.class);
                list = new ArrayList<>();
                for(Feature f: featureCollection){
                    String location = f.getProperty(LOCATION_KEY);
                    Number magnitude = f.getProperty(MAGNITUDE_KEY);
                    Long epochQuakeTime = f.getProperty(QUAKETIME_KEY);
                    if(null == location || null == magnitude ||
                            null == epochQuakeTime){
                        System.err.println("Invalid data" + f.toString());
                        continue;
                    }
                    
                    Point point = (Point) f.getGeometry();
                    LngLatAlt lla = point.getCoordinates();
                    double longitude = lla.getLongitude();
                    double latitude = lla.getLatitude();
                    double depth = lla.getAltitude();
                    
                    EarthQuakeData data = new EarthQuakeData(location,
                            new Date(epochQuakeTime), magnitude.doubleValue(), 
                            latitude, longitude, depth);
                    
                    list.add(data);
                }
            }
            catch (FileNotFoundException ex) {
                Logger.getLogger(GeoJSONEarthQuakeDataFactory.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GeoJSONEarthQuakeDataFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
            return list;
            
        }
       catch (MalformedURLException ex) {
            Logger.getLogger(GeoJSONEarthQuakeDataFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    public static void main(String[] args) {
        EarthQuakeDataFactory factory = new GeoJSONEarthQuakeDataFactory();
        List<EarthQuakeData> list = factory.getData();
        list.forEach((earthquakeData) -> 
                System.out.println(earthquakeData.toString()));
    }
    
}
