package Repl;
/*
For you to do:
declare 3 instance variables to hold an integer, double and char values.
Create 2 instances of the class and assign values to variables and the print them
**Expected Output:**
10
10.23
a
100
100.23
s
```
 */
public class Repl121 {

static int a=10;
static double b=10.23;
static char c='a';
static void m1(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
static void m2(){
    c='s';
    System.out.println(a*10);
    System.out.println(b+90);
    System.out.println(c);
}



    public static void main(String[] args) {

m1();
m2();



    }}
