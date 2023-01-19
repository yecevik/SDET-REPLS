package Repl;

import java.util.ArrayList;

/*# ArrayList
Create a array list that will hold Integer Objects:
Add below elements to it.
111
222
333
444
555
666
Print first, third and fifth element from your array
**Expected Output:**
111
333
555
```*/
public class Repl184 {
    public static void main(String[] args) {

        ArrayList<Integer> num=new ArrayList<>(6);
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);

        System.out.println(num.get(0));
        System.out.println(num.get(2));
        System.out.println(num.get(4));


    }


}
