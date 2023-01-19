package Repl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Create HashMap
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
map.put("mango", 40);
 map.put("mango", 40);
Using iterator retrieve all keys and values if the format below:
**Expected Output:**
Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40
 */
public class Repl203 {
    public static void main(String[] args) {

        HashMap<String ,Integer> map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println("Key = "+stringIntegerEntry.getKey()+" and value = "+stringIntegerEntry.getValue());
        }


        }



    }

