/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unboxingexample;

/**
 *
 * @author msjahid
 */
public class UnboxingExample {

    /**
     * @param args the command line arguments
     */
    public int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
       UnboxingExample example = new UnboxingExample();
       Integer a = 10;
       Integer b = 20;
       example.add(a,b);
    }
    
}
