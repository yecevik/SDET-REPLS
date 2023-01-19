package Repl;

import java.util.HashMap;
import java.util.Iterator;

/*
 Create Hash Map.
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using EntrySet print the key and values pairs using iterator only
replace with below key THREE--> ASEL and key FIVE-->SUMAIR
Using EntrySet print the key and values pairs using iterator only
OUTPUT
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL
 */
public class Repl207 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");
        System.out.println("HashMap Before Replace :");

        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            var map1 = iterator.next();
            var key = map1.getKey();
            var val = map1.getValue();


            System.out.println(key + " : " + val);
        }
        System.out.println("------------------");
        System.out.println("HashMap After Replace :");
        var iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            var map1 = iterator1.next();

            var key1 = map1.getKey();
            var val1 = map1.getValue().replace("EEE", "SUMAIR").replace("CCC","ASEL");




                System.out.println(key1 + " : " + val1);

        }
    }}
