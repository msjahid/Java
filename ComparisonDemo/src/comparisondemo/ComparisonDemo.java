/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparisondemo;

import java.util.Scanner;

/**
 *
 * @author msjahid
 */
public class ComparisonDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        if(value1 == value2){
            System.out.println("value1 == value2");
        }
        if(value1 != value2){
            System.out.println("value1 != value2");
        }
        if(value1 > value2){
            System.out.println("value1 > value2");
        }
        if(value1 < value2){
            System.out.println("value1 < value2");
        }
        if(value1 >= value2){
            System.out.println("value1 <= value2");
        }
        if(value1 <=value2){
            System.out.println("value1 <= value2");
        }
    }
    
}
