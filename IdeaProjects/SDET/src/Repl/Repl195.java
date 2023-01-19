package Repl;

import java.util.HashSet;

public class Repl195 {
    public static void main(String[] args) {
        /*
        Create the HashSet with list of Integers add the below numbers for the list
111
111
111
999
999
999
Print elements one by one.
**Expected Output**
999
111
         */
        HashSet<Integer> hs=new HashSet<>();
        hs.add(111);
        hs.add(111);
        hs.add(111);
        hs.add(999);
        hs.add(999);
        hs.add(999);
        System.out.println(hs);
        for (Integer h : hs) {
            System.out.println(h);
        }

    }


}
