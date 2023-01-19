package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {
    private static int ccc;

    public static void main(String[] args) {

        //Create an arrayList of drinks.
        // If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinks=new ArrayList<>(6);
        drinks.add("coke");
        drinks.add("milk");
        drinks.add("juice");
        drinks.add("almond milk");
        drinks.add("whiskey");
        drinks.add("water");

        Iterator<String> iterator=drinks.iterator();
        System.out.println(drinks);

        while( iterator.hasNext()){
            String drink=iterator.next();
            if (drink.contains("e")||drink.contains("a")){
                drinks.set(ccc, "water");
            }
            ccc++;
        }
        System.out.println(drinks);

    }
}
