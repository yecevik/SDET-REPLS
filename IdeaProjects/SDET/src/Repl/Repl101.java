package Repl;
/*
**For you to do:**
Inputs:
String word;
Write a for loop that will print out every other letter in a String, starting with the first letter.
 These letters should be printed all on one line with no space in between.
Sample input/outputs
In: hello
hlo
In: SSyynnttaaxxTTeecchhnnoollooggiieess
SyntaxTechnologies
 */
public class Repl101 {
    public static void main(String[] args) {

        String s="SSyynnttaaxxTTeecchhnnoollooggiieess";

        for (int i = 0; i < s.length(); i+=2) {
            System.out.print(s.charAt(i));

        }
    }
}
