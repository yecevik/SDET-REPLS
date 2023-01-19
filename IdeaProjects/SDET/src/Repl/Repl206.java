package Repl;

import java.util.HashMap;
import java.util.Map;

/*
# Hash Map
Create a Hash Map of String pairs
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using entry set print key and values pairs using loop
Remove below from Map
"ONE"
"FOUR"
Using entry set print key and values pairs using loop
**Expected Output:**
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
 */
public class Repl206 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        System.out.println("HashMap Before Remove :");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey()+" : "+stringStringEntry.getValue());

        }
        map.remove("ONE", "AAA");
        map.remove("FOUR", "DDD");
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey()+" : "+stringStringEntry.getValue());


        }
    }
}