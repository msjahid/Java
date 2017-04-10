/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.io.demo;

import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author msjahid
 */
public class FileIODemo {
    public static void writeDemo(){
        try{
        RandomAccessFile output = new RandomAccessFile("output.txt", "rw");
        /*
        output.setLength(0);
        output.writeBytes("CSE2015\n");
            System.out.printf("%d\n", output.length());
          */
        output.seek(output.length());
        output.writeBytes("CSE3012\n");
        } catch(FileNotFoundException e){
            System.out.printf("we did not dind output.txt\n");
        } catch(IOException e){
            System.out.printf("Could not write to file output.txt\n");

        }
    }
    public static void readDemo() {
        try{
        RandomAccessFile input = new RandomAccessFile("output.txt", "r");
        String line;
        //while((input.readLine()) != null)
        while(true)
        //for(;;)
        {
            
               line = input.readLine();
               if(line == null){
                break;
            }
            System.out.printf("%s\n", line);
           
        }
        } catch(FileNotFoundException e){
            System.out.printf("File not found exception\n");
        } catch(IOException e){
            System.out.println("Could not read from file\n");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //writeDemo();
        readDemo();
    }
}
