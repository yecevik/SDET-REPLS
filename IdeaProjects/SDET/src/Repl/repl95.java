package Repl;

import java.util.Scanner;

/*
**For you to do:**
Using Scanner class input string value.
Print out the following: "The first 3 letters of \_\_\_ is ___"
For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
 */
public class repl95 {
    public static void main(String[] args) {
        System.out.println("enter a word!");
        Scanner scan=new Scanner(System.in);
        String aaa= scan.nextLine();
        System.out.println("The first three letters of "+aaa+ " is "+aaa.substring(0,3));


    }
}
