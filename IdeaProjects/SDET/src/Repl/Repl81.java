package Repl;
/*
**For you to do:**
Write a program that prints the highest value in the array.
**Expected Output:**
input [5,4,8]
8
 */
public class Repl81 {
    public static void main(String[] args) {
        int[][] arr = {
                {5,2,3,7},
                {1,5,1,1},
                {8,3,1,2}
        };

        int max = arr[0][0];

        for (int [] arr1:arr
        ) {
            for (int x:arr1
            ) {
                if(x>max){
                    max=x;
                }
            }
        }
        System.out.print(max);
    }
}


