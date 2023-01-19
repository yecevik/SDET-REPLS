package Repl;
/*
Create a method that will accept 2 numbers as parameters
and return true if both numbers are even otherwise returned false
( Return false if one or both given numbers are not even)
Examples:
- bothEven(4,6) ==> true
- bothEven(3,4) ==> false
- bothEven(-1,1) ==> false
**Expected Output:**
false
 */
public class Repl116 {

public static void m1(){

    int a=101;
    int b=20;
    if (a%2==0 && b%2==0){
        System.out.println("true");
    }else System.out.println("false");



}


    public static void main(String[] args) {
    m1();

    }
}
