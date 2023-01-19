package Repl;
/*
**For you to do:**
Write a program that creates an array of strings with the following
values{"This", "is", "array", "of", "strings"} and prints all values in one line.
**Output:**
This is array of strings
 */
public class Repl73 {
    public static void main(String[] args) {
String [] arr={"This", "is", "array", "of", "strings"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
