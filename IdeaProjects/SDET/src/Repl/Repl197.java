package Repl;

import java.util.HashSet;
import java.util.Set;

/*
Create a set collection in which you do not want to preserve or sort the order and add below values to it.
Red
Pink
Yellow
White
Black
Print set collection
And get total number of colors available in the set
**Expected Output:**
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5
 */
public class Repl197 {
    public static void main(String[] args) {


        Set<String> s1=new HashSet<>();
        s1.add("Red");
        s1.add("Pink");
        s1.add("Yellow");
        s1.add("White");
        s1.add("Black");
        System.out.println("Original Hash Set: "+s1);
        System.out.println("Size of the Hash Set: "+s1.size());

    }
}
