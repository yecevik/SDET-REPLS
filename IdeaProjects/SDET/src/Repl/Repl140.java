package Repl;
/*
For you to do:

Create the maxLength method that will accept String array of words and return the word with the largest length.

Method should visible only within same package!

**Expected Output:**

```
this is long
```
 */
public class Repl140 {

    public static String maxLength(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));

    }

}
