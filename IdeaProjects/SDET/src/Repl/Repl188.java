package Repl;
/*
Using Scanner class add 5 elements into ArrayList and then print all
elements from that ArrayList all in 1 line
Numbers in:
4
62
8
5
4
**Expected Output:**
4 62 8 5 4
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Repl188 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> number=new ArrayList<>(5);
        System.out.println("Enter number and press any letter to finish ");
        while (scan.hasNextInt()) {
            number.add(scan.nextInt());
        }

        for (Integer n:number
             ) {
            System.out.print(n+" ");

        }



      /*  for (int i = 0; i <=number.toArray().length - 1; i++) {
            System.out.print(number.get(i) + " ");}
       */
    }
}