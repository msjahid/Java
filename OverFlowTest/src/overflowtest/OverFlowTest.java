/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overflowtest;

/**
 *
 * @author msjahid
 */
public class OverFlowTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = Integer.MAX_VALUE;
       int b = a + 5;
       int c = a * b;
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       int x = 1;
       int y = 2;
       System.out.println(x / y);//Underflow = this should be 0.5 output but int show this output 0
    }
    
}
