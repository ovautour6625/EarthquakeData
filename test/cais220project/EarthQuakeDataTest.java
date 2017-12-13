/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cais220project;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Owen
 */
public class EarthQuakeDataTest {
    
    public EarthQuakeDataTest(){
        
    }
    
    @Test
    public void testEarthQuakeData(){
        String location = "Boston";
        Date date = new Date(0);
        double magnitude = 4.0;
        double latitude = 50.0;
        double longitude = 40.0;
        double depth = 200.00;
        EarthQuakeData test = new EarthQuakeData(
                location, date, magnitude, latitude, longitude, depth);
        assertTrue(test.getLocation() == location);
        assertTrue(test.getQuakeTime() == date);
        assertTrue(test.getMagnitude() == magnitude);
        assertTrue(test.getLatitude() == latitude);
        assertTrue(test.getLongitude() == longitude);
        assertTrue(test.getDepth() == depth);
    }
}
