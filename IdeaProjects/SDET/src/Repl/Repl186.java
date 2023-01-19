package Repl;


/*
# ArrayList Remove
Create an Arraylist of type Integer.
Add below elements to it.
111
222
333
444
555
666
Print the ArrayList.
remove all the elements.
Print the Arraylist.
**Expected Output:**```
[111, 222, 333, 444, 555, 666]
[]

 */
import java.util.ArrayList;
public class Repl186 {

    public static void main(String[] args) {

        ArrayList<Integer> num=new ArrayList<>(6);
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);
        System.out.println(num);
        num.clear();
        System.out.println(num);

    }
}
