import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap=new HashMap<>();
        studentMap.put(101, "John");
        studentMap.put(102, "Jason");
        studentMap.put(103, "Jordan");
        studentMap.put(104, "Jenny");
//to check if specific key or value exist
        System.out.println(studentMap.containsKey(101));
        System.out.println(studentMap.containsValue("Jordan"));
//to access 1 value
        System.out.println(studentMap.get(102));

//replace value
        studentMap.replace(104, "Nikky");
        System.out.println(studentMap);
//remove object
       // studentMap.remove(103);
        System.out.println(studentMap);
        for (var aaa : studentMap.entrySet()) {
           //System.out.println(aaa);
           // System.out.println(aaa.getKey()+" : "+aaa.getValue());
            System.out.println(aaa.getValue());

        }
    }
}
