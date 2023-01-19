package Repl;
/*
**For you to do:**
Write a program that will print the sum of all elements in 2D array.
**Expected Output:**
-9
 */
public class Repl82 {
    public static void main(String[] args) {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };

        int total=0;
        for (int[] b:a) {
            for (int c:b) {
                total+=c;

            }

        }

        System.out.println(total);
    }
}
