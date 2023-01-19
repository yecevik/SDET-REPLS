package Repl;
/*
**For you to do:**
Write a program that prints the total number of elements that are negative AND odd
**Output:**
for example -3 is both negative and odd
3
```
 */
public class Repl84 {
    public static void main(String[] args) {

        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
int total=0;
        for (int [] b:a) {
            for (int c:b) {
                if (c%2!=0 && c<0){
                    total++;
                }

            }

        }
        System.out.println(total);
    }
}
