package Repl;

import java.util.LinkedHashMap;

/*
Create A Map that will preserve an order of entry objects
Add below pairs :
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values of from the map
**Expected Output:**
Patrick ST
265
Vienna
22180
United State
```
 */
public class Repl200 {
    public static void main(String[] args) {

        LinkedHashMap<String,String > address=new LinkedHashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");

        for (String value : address.values()) {
            System.out.println(value);

        }

    }
}
