package Repl;
/*
**For you to do:**
Declare a static variable **number** that will hold an integer value:
Access **number** from the main method and assign value to it.
Create an Object of the class, access **number** in a nonstatic way and assing value of 200.
Print out **number** using class name and using instance
**Expected Output:**
200
200
 */
public class Repl125 {

    static int a;
    void m1(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        a=200;
        System.out.println(a);


        Repl125 obj=new Repl125();
        obj.m1(200);


    }
}
