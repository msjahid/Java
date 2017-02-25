/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxingexample;

/**
 *
 * @author msjahid
 */
public class AutoboxingExample {
    public Integer add(Integer a, Integer b){
        //Wrapper Class
        return a + b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutoboxingExample example = new AutoboxingExample();
        int a = 5;//Primitive Type 
        int b = 10;
        example.add(a,b);
        
    }
    
}