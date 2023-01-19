package Repl;

import java.util.ArrayList;
/*Create an array list that will hold String Objects

Find out wether array list is empty or not.

Add String value "Syntax" to it

Find out wether array list is empty or not.

**Expected Output:**

```
true
false
```

*/
public class Repl183 {
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        System.out.println(words.isEmpty());
        words.add("Syntax");
        System.out.println(words.isEmpty());

    }
}