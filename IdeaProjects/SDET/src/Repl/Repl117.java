package Repl;
/*
Create a method with the following specs:
Returns:
an integer
Name:
sumEvenToX
Parameters:
an integer called "x"
Purpose:
calculate the sum of the EVEN integers from 1 to x (including x)
Examples:
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20
 */
public class Repl117 {

public static void sumEvenToX(int x){
int sumEven=0;

    for (int i = 0; i <=x ; i++) {
        if ( i%2==0){
            sumEven=sumEven+i;

        }

    }
    System.out.println("sum even to x = "+sumEven);

}


    public static void main(String[] args) {
sumEvenToX(8);
    }
}
