package Repl;
/*
# ArrayList Loop
Create an arrayList of type Integer.
add below values.
111
111
111
999
999
999
Print all the values of List 1 by 1:
**Expected Output:**

111
111
111
999
999
999
```
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Repl185 {
    public static void main(String[] args) {

        ArrayList<Integer> num=new ArrayList<>(6);
        num.add(111);
        num.add(111);
        num.add(111);
        num.add(999);
        num.add(999);
        num.add(999);

        for (Integer n:num)
              {
                  System.out.println(n);

        }
        //Iterator<Integer> iterator =num.iterator();
        //while (iterator.hasNext()) {
           // System.out.println(iterator);}


            // for (int i = 0; i <=num.toArray().length-1; i++) {
         //   System.out.println(num.get(i));

        }

    }


