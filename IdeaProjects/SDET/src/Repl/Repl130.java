package Repl;
/*
**For you to do:**
Complete the mystery method so that it takes in an integer array as a parameter,
and then modifies each element based on whether it's even or odd.
 If the number is even, divide it by 2.  If it's odd, multiply it by 10.
 *
 * (20 2 3 5)
**Expected Output:**
10 1 30 2 50
 */
public class Repl130 {

    static int [] arr={20, 2, 3, 5};

    static void m1(){

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==0) {

                System.out.print(arr[i]/2+" ");
            } else if (arr[i]%2!=0) {
                System.out.print(arr[i]*10+" ");

            }
        }
    }

    public static void main(String[] args) {
        m1();
    }
}
