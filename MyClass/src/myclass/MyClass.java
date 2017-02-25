/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass;

public class MyClass {

    public void printText(String text){
        System.out.println(text);
    }
    public void writeText(String text1, String text2){
        System.out.println(text1 +" "+ text2);
    }
    public void  sum(int value1, int value2){
        int result = value1 + value2;
        System.out.println(result);
    }
    public String concat(String value1, String value2)
            throws IllegalArgumentException{
        if(value1== null){
            throw new IllegalArgumentException("value1 is null");
        }
        if(value2 == null){
            throw new IllegalArgumentException("value2 is null");
        }
        return  value1 + value2;
        
    }
    
    public static void main(String[] args) {
      MyClass ob = new MyClass();
      ob.printText("Banana");
      String x = "Call";
      String y = "Milk";
      ob.writeText(x,y);
       int value1 = 10;
       int value2 = 14;
        ob.sum(value1, value2);
        ob.concat(x, y);
       }
    
}
