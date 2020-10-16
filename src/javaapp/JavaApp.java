/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;
import java.util.*;

/**
 *
 * @author x17140404
 */
public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int myInt = 7;
        boolean myBool = true;
        double myDouble = 4.3;
        String myString = "bob";
        
        
        for(int i = 0; i<=10; i++){
            System.out.println(i); 
        }
        
        boolean isRaining = false;
        boolean isDaylight = true; 
   
        if(isRaining == false){
            System.out.println("It is raining");
        }
          
        else{
            System.out.println("It is not raining");
        }
        if(isDaylight == true){
            System.out.println("It is daylight");
        }
        else{
            System.out.println("It is daylight");
        }
        if(isRaining == true && isDaylight == true){
            System.out.println("It is daylight and it is raining");
        }
         
        if(isRaining == true || isDaylight == true){
            System.out.println("It is daylight and it is raining");
        }   
        
        int [] array = new int[5];
        
        array[0] = 7;
        array[1] = 5;
        
        for(int i = 0; i <array.length; i++){
           System.out.println(array[i]);
        }
        
        String [] array2 = new String[5];
        
        array2[0] = "Robert";
        array2[1] = "Foster";
        array2[2] = "is";
        array2[3] = "very";
        array2[4] = "cool";

        for(int i = 0; i <array2.length; i++){
           System.out.println(array2[i]);
        }
 
    }
}

