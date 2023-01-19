package Repl;
/*
Create a method that will not be handling exception and throwing it at caller.
In main method call method and handle the exception.
**Expected Output:**
java.io.FileNotFoundException:  (No such file or directory)
 */

import java.io.FileInputStream;

public class Repl212 {

    public static void main(String[] args) {
       try {
           String path = "Test1.xlsx";

           FileInputStream fis = new FileInputStream(path);
       }catch (Exception e){
           System.out.println(e);
       }
    }
}