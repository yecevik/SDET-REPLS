package Repl;
/*
Write the logic that picks largest and second largest numbers from a list add them and return the results.
 input to method is a list that contains the numbers
input [10,20,30,40]
output [70]
input[5,3,8,9,10,11,5]
output [21]
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;
class Repl222 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(findMaxSum(list));
    }

    public static int findMaxSum(List<Integer> list) {
        int largestNum=0;
        int largestNumIndex = 0;
        int secondLargestNum = 0;
        int largestSum=0;

        for(int i = 0; i < list.size(); i++)
        {
            if(largestNumIndex < list.get(i)) {
                largestNumIndex = i;
                largestNum=list.get(i);
            }
        }
        list.remove(largestNumIndex);
        for (int j = 0; j < list.size(); j++) {
            if (secondLargestNum < list.get(j)) {
                secondLargestNum = list.get(j);
            }
        }
        largestSum= secondLargestNum+largestNum;
        return largestSum;
    }

}