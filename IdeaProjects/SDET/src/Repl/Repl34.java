package Repl;

import java.util.Scanner;

/*
Write a program to find the largest number among three distinct numbers using nested if condition
Please use Scanner class to take input from users
**Expected Output:**
Please enter 3 distinct numbers 4 5  and 14
The largest number is 14
 */
public class Repl34 {
    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        if (a>b&&a>c){
            System.out.println("The largest number is: "+a);
        }else if (b>a&&b>c){
            System.out.println("The largest number is: "+b);
        }else {
            System.out.println("The largest number is: "+c);
        }

    }
}
