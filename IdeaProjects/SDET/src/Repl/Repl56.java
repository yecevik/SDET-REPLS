package Repl;
/*
**For you to do:**
Create a for loop that prints out even numbers from 2 to 14 using if condition
Must include the number 14 in the output
**Output:**
2
4
6
8
10
12
14
 */


public class Repl56 {
    public static void main(String[] args) {

        for (int i = 0; i <16 ; i+=2) {
            if(i%2==0){
                System.out.println(i);
            }

        }

    }
}
