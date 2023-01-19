package Repl;

import com.sun.source.tree.Tree;

import java.util.*;

/*
**For you to do:**
Write a program that creates a String array with size 7.
Ask the user to input Days of a week beginning with Sunday using Scanner class.
Add these inputs to your array and then print all values from that array
Example:
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday etc
**Example Output:**
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday
Please enter day 4 of the week
Wednesday
Please enter day 5 of the week
Thursday
Please enter day 6 of the week
Friday
Please enter day 7 of the week
Saturday
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
 */
public class Repl76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] ddd=new String[7];
        for (int i=0; i<ddd.length; i++) {
            System.out.println("Please enter day " + (i+1) + "  of the week");
            ddd[i]=scan.next();
        }  for (int i=0; i<ddd.length; i++) {
            System.out.println(ddd[i]+" ");

        }



       /* Scanner scan = new Scanner(System.in);
        ArrayList<String> week=new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            System.out.println("Please enter day " + i + "  of the week");
         String day = scan.next();
         week.add(day);


       }

        for (String w:week){
            System.out.println(w); */


        /*Scanner aaa=new Scanner(System.in);
        System.out.println("Please enter day 1 of the week");
        String d1=aaa.next();
        System.out.println("Please enter day 2 of the week");
        String d2=aaa.next();
        System.out.println("Please enter day 3 of the week");
        String d3=aaa.next();
        System.out.println("Please enter day 4 of the week");
        String d4=aaa.next();
        System.out.println("Please enter day 5 of the week");
        String d5=aaa.next();
        System.out.println("Please enter day 6 of the week");
        String d6=aaa.next();
        System.out.println("Please enter day 7 of the week");
        String d7=aaa.next();


        String[] arr= {d1,d2,d3,d4,d5,d6,d7};
        for (String a:arr) {
            System.out.println(a);
        }

         */
        }
    }

