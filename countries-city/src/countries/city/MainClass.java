/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countries.city;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author elkamash
 */
public class MainClass {
    public static void main(String[]args) throws IOException{
    ArrayList<Country> countries= new ArrayList<Country>();
   ArrayList<City> cities= new ArrayList<City>();
   CountriesCityDAO ccd=new CountriesCityDAO();
   countries=ccd.ReadFileCountry("D:\\Countries.csv");
   cities=ccd.ReadFileCity("D:\\Cities.csv");
//   System.out.println(countries);
//   System.out.println(cities);
Map <String,ArrayList<City>>map=  ccd.mapping();
System.out.println(map);
   System.out.println("###########################################################");
   System.out.println("Enter the country code");
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String code = reader.readLine();
        
       ccd.SortPopulation(code,cities);
          System.out.println("###########################################################");

ccd.GetCountriespopulation(countries);
   System.out.println("###########################################################");
System.out.print("average population is: ");
//ccd.GetAveragePopulation(countries);
   System.out.println("###########################################################");
   System.out.print("max population is:");

   ccd.GetMaxPopulation(countries);
ccd.GetHighestPopCity(map);
   System.out.println("###########################################################");
System.out.println("Highest population capital is:");
ccd.GetHighestPopCapital(countries,cities);
   


        
//    map.forEach(k,v-> v.stream().sorted());
   
   
   
   
    
    
    
    
    
    
    
    
    
    
    
    }
}
