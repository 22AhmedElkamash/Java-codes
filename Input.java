/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package input;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author elkamash
 */
public class Input {


    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(r);
        String input = bf.readLine();
        FileWriter writer = new FileWriter("C:\\Users\\elkam\\Documents\\NetBeansProjects\\input\\in.txt");
        BufferedWriter buffer= new BufferedWriter(writer);
        while (!("stop".equals(input))){
            buffer.write(input);
            buffer.newLine();
            System.out.println("data is "+ input);
            input = bf.readLine();
            
    
        }
        buffer.close();
        
    }
        
        
        
        
        
    }
    

