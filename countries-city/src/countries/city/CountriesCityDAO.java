/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countries.city;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Comparator;
//import static java.util.Comparator.comparing;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author elkamash
 */
public class CountriesCityDAO {
             ArrayList<City> cities= new ArrayList<City>();
             ArrayList<Country> countries= new ArrayList<Country>();
             




    public ArrayList<City> ReadFileCity(String filename) throws FileNotFoundException, IOException{

        FileReader fr= new FileReader(filename);
        BufferedReader bf = new BufferedReader(fr);
        String line = bf.readLine();
        String [] values;
        while (line!=null){
        values=line.split(",");
        values=Arrays.stream(values).toArray(String[]:: new );
        cities.add(new City (Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2]),values[3].trim()));
        line=bf.readLine();
        }
        
 
        bf.close();
        return cities;
    }
    
    
    
      public  ArrayList<Country>  ReadFileCountry(String filename) throws FileNotFoundException, IOException{
        FileReader fr= new FileReader(filename);
        BufferedReader bf = new BufferedReader(fr);
        String line = bf.readLine();
        
        while (line!=null){
            String [] values;
            values=line.split(",");
//            values=Arrays.stream(values).toArray(String[]:: new );
            countries.add(new Country (values[0].trim(),values[1],values[2],Double.parseDouble(values[3]),Double.parseDouble(values[4]),Double.parseDouble(values[5]),
            Integer.parseInt(values[6])));
            line=bf.readLine();
//            System.out.println(values);
        }
        bf.close();
        return countries;
    }
      
      //mapping country code and list of cities 

      public Map <String,ArrayList<City>> mapping(){
          Map <String,ArrayList<City>> map = new LinkedHashMap <>();
          
          for (City c:cities){
          String code=c.getCountryCode();
          ArrayList <City> cit=new ArrayList<>();
          if(map.get(code)==null)
          {cit.add(c);
          map.put(code,cit);
          
          }
          else
          {cit=map.get(code);
          cit.add(c);
          map.put(code,cit);
          
          }
          
          
          }
           map.forEach((key,value) -> {
                 System.out.print(key + ":" );
                 value.stream().map(c->c.getName()).forEach(System.out::print);
                 System.out.println("");
                 
              });
           return map;
          
      }
      
      
      
     //sorted cities according to population  
      public void SortPopulation(String code,ArrayList<City> ccc){
      ccc.stream().filter(c->c.getCountryCode().equals(code)).sorted(new Comparator<City>(){
          public int compare (City c1 , City c2)
          {return c1.getPupulation().compareTo(c2.getPupulation());
          
          
          }
                    
      }).forEach(System.out::println);
      
      
      
      }
      
      
      //list of countries population
      public void GetCountriespopulation (ArrayList<Country> c){
      
      c.stream().forEach(b -> System.out.println(b.getName()+"----->"+b.getPopulation())); 
      }
      //get average countries population
      public void GetAveragePopulation(ArrayList<Country>c){
     System.out.println( c.stream().mapToDouble(b->b.getPopulation()).average().getAsDouble());
  
      
      }
      public void GetMaxPopulation(ArrayList<Country>c){
          Country maxpop=c.stream().max(new Comparator<Country>(){
          public int compare (Country c1 , Country c2)
          {return c1.getPopulation().compareTo(c2.getPopulation());
      
      
      
      
      }
}).get();
        System.out.print(maxpop.getName()+" "+maxpop.getPopulation() );
          

                  }
      
      
      public void GetHighestPopCity(Map <String,ArrayList<City>> map){
         map.forEach((key,value) -> {
                 
             City maxcity = value.stream().max(new comparee()).get();
              System.out.println(maxcity.getName()+" "+maxcity.getPupulation()+" "+maxcity.getCountryCode());  
                 
              });
      
      
      
      }
      
      public void GetHighestPopCapital(ArrayList<Country>c,ArrayList<City> c2){
          System.out.println(c.stream().filter(co->co.getCapital() > -1).map(co->c2.stream().filter(ci->ci.getId() == co.getCapital()).collect(Collectors.toList()).get(0)).max(new comparee()));
               
             
          
          
          
      
      
      
      
      }
      
      
      public class comparee implements Comparator<City>{
      public comparee(){}
          public int compare(City c1,City c2){
          
          return c1.getPupulation().compareTo(c2.getPupulation());
         }
      }
      
}




            
     
      
            
            
            

       
      
      
        
        
    
  
    
   
   
   
   
   
   
   
   
    
