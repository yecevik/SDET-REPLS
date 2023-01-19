package Repl;
/*
**For you to do:**
Create a method that takes a list as a paramter removes an element if it starts
* with letter A from given List and return new
* List then in the main method print that list.
 **Expected Output:**
[USA, Kazakhstan, Pakistan, Russia]
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Repl194 {
    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

       /* var iterator = countries.iterator();
        while (iterator.hasNext()){
            String item=iterator.next();
            if( item.startsWith("A")){
                iterator.remove();
            }
        }*/
        countries.removeIf(x -> x.startsWith("A"));

        System.out.println(countries);
    }
}
