package Repl;
/*
Declare static variable in class level as below and assign its value:
String ss="Welcome To Syntax Technologies"
Access variable in the main method and print it using three ways you learned so far
Hint:
first way: By calling directly
Second way: By using the className
Third way: By creating the object of the class
**Expected Output:**
Welcome To Syntax Technologies
Welcome To Syntax Technologies
Welcome To Syntax Technologies
 */
public class Repl124 {

   static String ss="Welcome To Syntax Technologies";
static void m1(){

    System.out.println(ss);
}

    public static void main(String[] args) {

    Repl124 aaa=new Repl124();
    aaa.m1();
        System.out.println(ss);
        m1();
        System.out.println("Welcome To Syntax Technologies");
    }
}
