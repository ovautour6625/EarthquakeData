/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cais220project;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Owen
 */
public class JSONEarthQuakeDataFactory extends EarthQuakeDataFactory{

    @Override
    public List<EarthQuakeData> getData() {
         ObjectMapper mapper = new ObjectMapper();
         
         try{
            List<EarthQuakeData> list = mapper.readValue(
            new File("Earthquakes-big.json"), 
            new TypeReference<List<EarthQuakeData>>() {});
            return list;
         }
         catch(IOException ex){
             
         }
         return null;
     }
    
}
