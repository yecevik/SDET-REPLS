package Repl;

/*
Create a Linked List that will store all prime numbers from 1 to 100
Step 1. Create a method that will identify wether number is prime or not
Step 2. Add all prime numbers into Linked List
Print Linked List:
**Expected Output:**
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
```
 */
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
public class Repl192 {
    public static void main(String[] args){
        LinkedList<Integer> num=new LinkedList<>();
        for(int i=1;i<=100;i++){
            boolean flag = false;
            if(i==1){
                flag=true;

            }else{
                for (int j = 2; j <= i / 2; ++j) {
                    // condition for nonprime number
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag)
                num.add(i);

        }
        System.out.println(num);

    }}