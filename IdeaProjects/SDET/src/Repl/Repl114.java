package Repl;
/*
**For you to do :**
Step1: Create three methods that will accept 2 in parameters on integer type
Step2: Write the logic in methods to perform actions below:
The first method for multiplication
The second method for addition
The third method for subtraction
Step3: execute all methods
1. for the addition method add two numbers to make 30
2. for multiplication multiply two numbers to make 30
3. for Subtraction subtract two numbers to equal 20
**Expected Output:**
Addition 30
Multiplication 30
Subtraction 20
 */

public class Repl114 {

public static void m1(){
    int a1=10;
    int a2=20;
    System.out.println("Addtition "+ (a1+a2));

}
    public static void m2(){
        int b1=10;
        int b2=3;
        System.out.println("Multiplication "+ b1*b2);
    }
    public static void m3(){
        int c1=45;
        int c2=25;
        System.out.println("Substraction "+ (c1-c2));
    }

    public static void main(String[] args) {
m1();
m2();
m3();


    }
}
