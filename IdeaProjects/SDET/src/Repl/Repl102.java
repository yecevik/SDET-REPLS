package Repl;
/*
**For you to do:**
Inputs:
String word;
Write a for loop that will loop through every character of a word
and print out each character, each on a separate line
 Sample inputs/outputs:
In: hello
h
e
l
l
o
```
In: zimbabwe
z
i
m
b
a
b
w
e

In: wow!
w
o
w
!
 */
public class Repl102 {
    public static void main(String[] args) {

        String s ="zimbabwe";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));

        }

    }
}
