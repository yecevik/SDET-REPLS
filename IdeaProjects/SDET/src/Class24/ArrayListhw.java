package Class24;

import java.util.ArrayList;

public class ArrayListhw {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(5);
        names.add("Michael");
        names.add("Nicole");
        names.add("David");
        names.add("Cathrin");
        names.add("Joe");

        if (names.isEmpty()) {
            System.out.println("ArrayList is Empty");
        } else {
            System.out.println("ArrayList is NOT Empty");
            System.out.println("--------------");

            if (names.contains("Joe")){
                System.out.println("Joe is in the ArrayList");
                }else {
                System.out.println("Joe is not in the ArrayList");
            }
            System.out.println("-------------");

            System.out.println("The size of the ArrayList is: "+names.size());
            System.out.println("Names in the ArrayList are: "+names);

        }
    }
}