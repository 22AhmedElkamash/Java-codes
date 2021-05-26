/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cutter;

/**
 *
 * @author elkamash
 */
public class Cutter {
public void cut(String in){
String [] parts =in.split("\\.");
for (int i =0;  i<4; i++){
    System.out.println(parts[i]);

};
}
   
  
    
}
