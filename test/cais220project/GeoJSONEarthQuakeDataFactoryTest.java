/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cais220project;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Owen
 */
public class GeoJSONEarthQuakeDataFactoryTest {
    
    public GeoJSONEarthQuakeDataFactoryTest(){
        
    }
    
    
    @Test
    public void testGetData(){
        System.out.println("getData");
        GeoJSONEarthQuakeDataFactory instance =
                new GeoJSONEarthQuakeDataFactory();
        List<EarthQuakeData> list = instance.getData();
        assertTrue(list.size()>0);
        list.forEach((data) -> {
            assertTrue(null != data.getQuakeTime());
            assertTrue(null != data.getLocation());
            assertTrue(data.getMagnitude() < 10);
            assertTrue(data.getMagnitude() > -1);
            assertTrue(data.getLocation().length() > 0);
        });
    
}
}
