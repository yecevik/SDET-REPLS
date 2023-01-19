package Repl;

import java.util.HashMap;

/*
Create a Map in which you do not need to preserve the order of the entries
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"

"Zip" = "22180"
"Country" = "United State"
Find how many entries are inside the map
Remove all entires from the Map
Find the Map size again
**Expected Output:*
5
0
 */
public class Repl201 {
    public static void main(String[] args) {
        HashMap<String,String> address=new HashMap<>();

        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");

        System.out.println(address.size());
        address.clear();
        System.out.println(address.size());
    }


}
