/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdemo;

import java.util.Scanner;

/**
 *
 * @author msjahid
 */
public class InputDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
       /* while(sc.hasNext())
    {
        System.out.println(sc.nextInt());//multiple input in singel line 
    }*/
       int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("The result is: " + result);
    }
    
}
