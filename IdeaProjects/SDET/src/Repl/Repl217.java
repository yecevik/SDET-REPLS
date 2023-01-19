package Repl;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Repl217 {

/*
Complete countDuplicates method This method should count how many
numbers are appearing more than once and should return the count.
Input [12,12,13,45,78,7,7] output 2
Input [12,12,7,7,7,7,7] output 2
Input [12,120,13,45,78,17,57] output 0
Input [12,12,13,45,78,67,87] output 1
 */


    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(12);
        numbers.add(13);
        numbers.add(45);
        numbers.add(78);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(45);

        System.out.println(countDuplicates(numbers));


    }


    static int countDuplicates(List<Integer> numbers) {
        Set<Integer> mySet=new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i+1; j < numbers.size(); j++) {
                if (numbers.get(i) == numbers.get(j)) {
mySet.add(numbers.get(j));

                }
            }

        }
        return mySet.size();


    }


}