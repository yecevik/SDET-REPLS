package Repl;
/*
**For you to do:**
There is a code that takes input as a String.
Write a program that will print out only vowels of that string
Sample input/outputs:
```
In: howdyho
oo
```
In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */
public class Repl105 {
    public static void main(String[] args) {


        String s = "poopoo what idk what im doing";

        for (int i = 0; i < s.length()-1; i++) {
            char a=s.charAt(i);
            if( a=='a'|| a=='A'|| a=='e'|| a=='E'|| a=='o'|| a=='O'|| a=='u'|| a=='U'|| a=='i'|| a=='I')
            System.out.print(a);

        }

    }
}