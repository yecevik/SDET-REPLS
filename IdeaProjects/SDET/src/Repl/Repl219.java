package Repl;

import java.util.ArrayList;
import java.util.List;

public class Repl219 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("steve");
        names.add("stevens");
        names.add("danny");
        names.add("steves");
        names.add("dan");
        names.add("john");
        names.add("johny");
        names.add("joe");
        names.add("alex");
        names.add("alexander");

        List<String> query = new ArrayList<>();
        query.add("steve");
        query.add("alex");
        query.add("joe");
        query.add("john");
        query.add("dan");

        System.out.println(countOnlyPrefixes(names,query));
    }
    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query){

        ArrayList<String>name=new ArrayList<>(names);
        ArrayList<String>quer=new ArrayList<>(query);

        ArrayList<Integer>cont=new ArrayList<>();

        for (int i = 0; i <quer.size() ; i++) {
            int count=0;

            String word=quer.get(i);{
                for (int j = 0; j <name.size() ; j++) {
                    if(name.get(j).contains(word)){
                        if(name.get(j).equalsIgnoreCase(word)){
                            continue;
                        }
                        count++;
                    }
                }cont.add(count);
            }

        }

        return cont;
    }
}
