/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticdemo;

/**
 *
 * @author msjahid
 */
public class ArithmeticDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int result2 = result;
        result = result - 1;
        System.out.println(result2 + " - 1 = " + result);
        result2 = result;
        result = result2 * 2;
        System.out.println(result2 + " * 2 = " + result);
        result2 = result;
        result  = result / 2;
        System.out.println(result2 + " / 2 = " + result);
        result2 = result;
        result = result + 8;
        System.out.println(result2 + " + 8 = " + result);
        result2 = result;
        result = result % 7;
        System.out.println(result2 + " % 7 = " +result);
        
    }
    
}
