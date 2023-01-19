package Repl;

/*
Create a static method with the following specs:
Returns:
an integer
Name:
countA
Parameters:
a String called s
Purpose:
count the number of occurrences of 'a' or 'A' within s
Examples:
countA("aaa") ==> 3
countA("aaBBdf8k3AAadnklA") ==> 6
Hint: How do you write a for loop to loop through every letter of a string?  You've done this multiple times already :)
 */
public class Repl133 {


    static String s;
    static int num;

    static void countA(String s) {
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'A')
                num++;

        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        countA("aaBBdf8k3AAadnklA");
    }
}
