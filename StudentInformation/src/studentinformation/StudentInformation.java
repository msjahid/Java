/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinformation;

import java.util.Arrays;

/**
 *
 * @author msjahid
 */
public class StudentInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student students[];
       students = new Student[5];
       students [0] = new Student(100, "Abul", "Uttara");
       students [1] = new Student(101, "Babul", "Kalabagan");
       students [2] = new Student(102, "Kabul", "Malibagh");
       students [3] = new Student(103, "Ratul", "Mirpur");
       students [4] = new Student(104, "Putul", "Nkhalpara");
       
       students[0].addGrade("A+", 1);
       students[1].addGrade("A", 3);
       students[2].addGrade("B+", 3);
       students[3].addGrade("C+", 2);
       CGPAComparator cgpaCompparator = new CGPAComparator();
       Arrays.sort(students, cgpaCompparator);
       
       for(int i = 0; i < students.length;i++)
       System.out.printf("%s\n",students[i]);
       
       int data[] = new int[5];
       data[0] = 8;
       data[1] = 80;
       data[2] = 17;
       data[3] = 4;
       data[4] = 90;
        System.out.printf("Before Sorting\n");
       for( int i = 0; i < data.length; i++)
            System.out.printf("%d\n", data[i]);
       Arrays.sort(data);
       for( int i = 0; i < data.length; i++)
            System.out.printf("%d\n", data[i]);
        
    }
    
}
