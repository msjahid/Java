/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unarydemo;

/**
 *
 * @author msjahid
 */
public class UnaryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result = +1;
        System.out.println(result);
        result --;
        System.out.println(result);
        result ++;
        System.out.println(result);
        result = -result;
        System.out.println(result);
        boolean success = false;
        System.out.println(success);
        System.out.println(!success);
    }
    
}
