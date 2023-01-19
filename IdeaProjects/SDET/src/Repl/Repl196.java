package Repl;

import java.util.HashSet;
import java.util.Set;

/*
Create a Set and and below values to it.

[third, first, second]

Print HashSet and then remove all the elements from Hashset and print it again.

**Expected Output:**

```
[third, first, second]
[]
```
 */
public class Repl196 {
    public static void main(String[] args) {


        Set<String> s1=new HashSet<>();
        s1.add("third");
        s1.add("first");
        s1.add("second");
        System.out.println(s1);
        s1.clear();
        System.out.println(s1);

     }

}
