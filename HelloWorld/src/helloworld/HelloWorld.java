/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author msjahid
 */
public class HelloWorld {
/**
     * @param args the command line arguments
     */
        public static int performAddition(int a, int b){
        int result = a + b;
        return result;
    }
        public static int performSubtarction(int a, int b){
        int result = a - b;
            return result;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int c = performAddition(x, y);
    int d = performSubtarction(x, y);
        System.out.println("Addition is: " + c);
        System.out.println("Subtraction is: " + d);
    }
    
}