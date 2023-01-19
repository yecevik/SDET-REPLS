package Repl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Count the number of repetations of words in an ArrayList append that count and return that list.
You need to implement a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList
input ["switch","tv","switch","tv","switch","tv"]
output [switch, tv, switch1, tv1, switch2, tv2]
In this example as word switch is repeated we pick the next entry
where it is repeated and append the count i.e how many times that
word was present previously
More Exmaples
input ["switch","tv","switch","tv","switch","tv","radio"]
output [switch, tv, switch1, tv1, switch2, tv2, radio]
input ["switch","tv","switch","tv"]
output [switch, tv, switch1, tv1]
if words are not repeated we get the same output
input ["switch","tv"]
output [switch, tv]
 */
public class Repl218 {

    public static void main(String[] args) {


        ArrayList<String> bobr = new ArrayList<>();
        bobr.add("switch");
        bobr.add("tv");
        bobr.add("switch");
        bobr.add("tv");
        bobr.add("switch");
        bobr.add("switch");
        bobr.add("tv");
        bobr.add("switch");
        bobr.add("tv");
        bobr.add("switch");
        bobr.add("radio");


        System.out.println(countDeviceNames(bobr));
    }
    public static List<String> countDeviceNames(List<String> bobr) {

        List<String>words=new ArrayList<>(bobr);

        for (int i = 0; i <words.size() ; i++) {
            int num=1;
            for (int j = i+1; j <words.size() ; j++) {
                if(words.get(i)==words.get(j)){
                    words.set(j, words.get(j) + num);
                    num++;
                }
            }
        }
        return words;
    }
}
