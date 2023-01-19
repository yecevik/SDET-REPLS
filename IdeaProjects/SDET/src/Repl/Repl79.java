package Repl;

/*
**For you to do:**
Write a program to print values from a 2D array
**Example Output:**
1.4 2.0 3.3 2.0
4.0 1.5 6.1 1.0
1.2 3.1 4.0 1.6
 */
public class Repl79 {
    public static void main(String[] args) {
        double[][] arr = {{1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}
        };

        for (double [] a:arr) {
            for (double z:a) {

                System.out.print(z+" ");

            }
            System.out.println();
        }
    }
}
