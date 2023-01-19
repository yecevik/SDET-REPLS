package Class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/*
How can you remove all duplicates from ArrayList?
List<String> aList=new ArrayList<>(); aList.add("John"); aList.add("Jane");
aList.add("James"); aList.add("Jasmine"); aList.add("Jane"); aList.add("James");
 */
public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        System.out.println(new HashSet<>(aList));


    }
}
