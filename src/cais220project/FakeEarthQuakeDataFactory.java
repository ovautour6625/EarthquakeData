/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cais220project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Owen
 */
public class FakeEarthQuakeDataFactory extends EarthQuakeDataFactory{

     @Override
    public List<EarthQuakeData> getData() {
        ArrayList<EarthQuakeData> list = new ArrayList<>(8);
        
        EarthQuakeData data = new EarthQuakeData("Syracuse, NY",
                                                 new Date(), 2.6,45.432,98.432,25.8);
        list.add(data);
        Date now = new Date();
        list.add(new EarthQuakeData("Allentown, PA",
            new Date(now.getTime() - 24l*60*60*1000), 6.1,20.1234,53.2314,60.2));
        list.add(new EarthQuakeData("Baltimore, MD",
            new Date(now.getTime() - 42l*24*60*60*1000), 4.2,100.432,43.532,34.5));
        list.add(new EarthQuakeData("Ithaca, NY",
            new Date(now.getTime() - 10l*24*60*60*1000), 1.7,64.541,321.341,193.2));
        list.add(new EarthQuakeData("Burlington, VT",
            new Date(now.getTime() - 3l*24*60*60*1000), 2.7,24.432,21.4321,97));
        list.add(new EarthQuakeData("Bangor, NY",
            new Date(now.getTime() - 7l*24*60*60*1000), 3.0,76.464,295.426,39.5));
        list.add(new EarthQuakeData("New Haven, CT",
            new Date(now.getTime() - 14l*24*60*60*1000), 3.6,54.278,35.864,64.2));
        list.add(new EarthQuakeData("Providenc, RI",
            new Date(now.getTime() - 20l*24*60*60*1000), 5.9,189.234,14.456,25.9));
        return list;
    }
    
}
