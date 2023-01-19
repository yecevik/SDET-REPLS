package Repl;
/*
**For you to do:**
Write a program that sums all numbers that are on even index and on even row.
**Expected Output:**
-4
 */
public class Repl85 {
    public static void main(String[] args) {

        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
       int  total=0;

        for (int i = 0; i < a.length; i+=2) {
            for (int j = 0; j <a[i].length ; j+=2) {
                total+=a[i][j];

            }

        }
        System.out.println(total);
    }
}
