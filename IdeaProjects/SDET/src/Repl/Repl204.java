package Repl;

import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
Create a Map that will preserve an order of entry objects
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values using iterator
**Expected output:**
Patrick ST
265
Vienna
22180
United State

 */
public class Repl204 {
    public static void main(String[] args) {
       LinkedHashMap<String, String> address = new LinkedHashMap<>();
        address.put("Street", "Patrick ST");
        address.put("Suite", "265");
        address.put("City", "Vienna");
        address.put("Zip", "22180");
        address.put("Country", "United State");
        System.out.println(address);

        for (String s : address.values()) {
            System.out.println(s);
        }
        }
    }
