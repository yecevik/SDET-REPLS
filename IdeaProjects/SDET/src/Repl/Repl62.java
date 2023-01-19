package Repl;
/*
**For you to do:**
Using for loop Print 1 to 10 Numbers except 5 and 6
**Expected Output:**
1
2
3
4
7
8
9
10
 */
public class Repl62 {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if(i==5||i==6)continue;
            System.out.println(i);

        }

    }
}
