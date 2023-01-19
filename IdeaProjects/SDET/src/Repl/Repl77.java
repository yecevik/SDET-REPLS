package Repl;

import java.util.Scanner;

/*
**For you to do:**
Create an array of integers that will store 5 elements taken from a user
Don't print any prompt message for the user
Then print out all the elements you have created in the first loop in reverse order.
**Example:**
Input:
1
2
3
4
5
Output:
5
4
3
2
1
 */
public class Repl77 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 5 things");
        String e1= scan.nextLine();
        String e2= scan.nextLine();
        String e3= scan.nextLine();
        String e4= scan.nextLine();
        String e5= scan.nextLine();

        String[] things={e1,e2,e3,e4,e5};

        for (int i = things.length-1; i >=0 ; i--) {
            System.out.println(things[i]);

        }

    }
}
