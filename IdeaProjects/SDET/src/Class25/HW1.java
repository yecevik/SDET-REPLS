package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class HW1 {

    //Create an arrayList of words. Remove every word that ends with “e”.

    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>(6);
        words.add("house");
        words.add("hello");
        words.add("time");
        words.add("pencil");
        words.add("apple");
        words.add("tomato");

        Iterator<String> iterator=words.iterator();
        System.out.println(words);

        while( iterator.hasNext()){
            String word=iterator.next();
            if (word.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);
    }

}
