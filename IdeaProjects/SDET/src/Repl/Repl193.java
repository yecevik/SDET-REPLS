package Repl;
/*
        Create Linked List that will store Integer Objects
        Add the values below:
        111
        222
        333
        444
        555
        666
        Create a logic to calculate sum of the all the values in list.
        Print the result of sum.
        **Expected Output:**
        Result of sum is 2331 ```
*/

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
public class Repl193 {
    public static void main(String[] args) {

int sum = 0;
        LinkedList<Integer> num1 = new LinkedList<>();

        num1.add(111);
        num1.add(222);
        num1.add(333);
        num1.add(444);
        num1.add(555);
        num1.add(666);

        for (int i = 0; i < num1.size(); i++) {
            sum=sum+ num1.get(i);
        }


        System.out.println("Result of sum is "+sum);

    }
}