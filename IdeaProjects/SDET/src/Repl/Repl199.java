package Repl;

import java.util.LinkedList;

/*
Create a Set collection in which you want to preserve an order of inserted String Objects.
Add the below values
- null
- Sohil
- Diego
- Alijon
- Asel
- Sumair
Print values 1 by 1 using loop and Iterator
null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair
```
 */
public class Repl199 {
    public static void main(String[] args) {

        LinkedList<String> set=new LinkedList<>();
        set.add("null");
        set.add("Sohil");
        set.add("Diego");
        set.add("Alijon");
        set.add("Asel");
        set.add("Sumair");

        for (String s : set) {
            System.out.println(s);

        }
        var iterator=set.listIterator();
        while (iterator.hasNext()){
            var item=iterator.next();
            System.out.println(item);
        }


    }
}
