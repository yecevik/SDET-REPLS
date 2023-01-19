package Class25;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class HW3 {

    public static void main(String[] args) {
        //Create an arrayList of even numbers from 1 to 500.
        // Remove any number that is divisible by 5 from that arrayList.

        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 2; i <= 500; i += 2) {
            numbers.add(i);
        }
        System.out.println(numbers);

        Iterator<Integer> iterator=numbers.iterator();
        while( iterator.hasNext()){
            Integer fives=iterator.next();
            if (fives%5==0){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}