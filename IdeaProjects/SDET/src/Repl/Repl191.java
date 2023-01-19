package Repl;
/*
Create an ArrayList of type boolean called listA and add below values
(true, false, false)
Create another array list call listB and ad all values from List A into it
Using iterator print all values from ListB 1 by 1
**Expected Output:**
true
false
false
 */

import java.util.ArrayList;

public class Repl191 {

    public static void main(String[] args) {
        ArrayList<Boolean> listA = new ArrayList<>();

        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean> listB = new ArrayList<>();
        listB.addAll(listA);
       // Iterator iterator = listB.listIterator();
        for (Boolean lll:listB
             ) {
            System.out.println(lll);

        }

        //for (int i = 0; i <= listB.toArray().length - 1; i++) {
           // System.out.println(listB.get(i) + " ");}


    }
}