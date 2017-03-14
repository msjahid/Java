/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpyramid;

/**
 *
 * @author msjahid
 */
public class NumberPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int noOfRows = 9;
        int rowCount = 1;
        for(int i = noOfRows; i > 0;i--){
            for(int j = 1; j<= i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j < rowCount; j++){
                System.out.print(rowCount + " ");
            }
            System.out.println();
            rowCount++;
        }
    }
    
}
