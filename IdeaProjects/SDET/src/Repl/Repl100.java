package Repl;
/*
  Given the following inputs:
String s;
Write a for loop that will print out the reverse of the string.
Sample input/outputs:

In: manhattan
nattahnam
In: processor
rossecorp
In: racecar
racecar
 */
public class Repl100 {
    public static void main(String[] args) {
        String s = "Manhattan";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse.toLowerCase());

        if (reverse.equalsIgnoreCase(s)) {

            System.out.println("This is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }
    }
}