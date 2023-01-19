package Repl;

import java.util.Scanner;

/*
**For you to do:**
You have Scanner class to input string value.
If language is Java it should print the:
"Java is a programming language".
If language is C it should print the:
"C is a procedural programming language"
If language is C++ it should print the:
"C++ is a middle-level programming language"
If any other should print:
Doesn't match any programming language"
 */
public class Repl96 {
    public static void main(String[] args) {
        System.out.println("Enter the name of the Language!:");
        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();

        if (str.equalsIgnoreCase("java")){
            System.out.println("Java is a programming language");
        }else if (str.equalsIgnoreCase("C")){
            System.out.println("C is a procedural programming language");
        }else if(str.equalsIgnoreCase("C++")){
            System.out.println("C++ is a middle-level programming language");
        }else {
            System.out.println("Doesn't match any programming language");
        }
    }
}
