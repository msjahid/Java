/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author msjahid
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String names [] = new String[5];
        names[0] = "Bhutan";
        names[1] = "Thailand";
        names[2] = "Ghana";
        names[3] = "Srilanka";
        names[4] = "Pakistan";
        names[3] = "Nepal";
        for (int i = 0; i < names.length; i++){
            System.out.printf("%s\n", names[i]);
           
        }
        System.out.println("-------------");
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Greenland");
        countries.add("Sweden");
        countries.add("Norway");
        countries.add("Ulraine");
        countries.set(2, "United Kingdom");
        for ( int i = 0; i < countries.size(); i++){
            System.out.printf("%s\n", countries.get(i));
        }
        
        if(countries.contains("Srilanka")){
        
    
        System.out.println("Srilanka contains this list");
    }
        else  {
                System.out.printf("Srilanka does not exits this list\n");
                }
    }
    
}
