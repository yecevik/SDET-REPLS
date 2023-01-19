package Repl;

/*
The subset of brackets enclosed within the confines of a matched pair of
brackets is also a matched pair of brackets.
Given  strings of brackets, determine whether each sequence of brackets is balanced.
If a string is balanced, return true. Otherwise, return false.


**Function Description**
Complete the function isBalanced in the editor below.
isBalanced has the following parameter(s):
string s: a string of brackets
Returns
string: either true or false
**Examples**
input "(()"  ->  false
input "("  ->  false
input ")"  ->  false
input "(()))"  ->  false
input "(())"  ->  true
input "()"  ->  true
input ")()("  ->  true
 */
public class Repl215 {
    public static boolean isBalanced(String str) {
        int balance = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }

    public static void main(String[] args) {


    }


}