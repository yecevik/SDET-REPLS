package Repl;

/*
1. Create Three classes (Main, A, B):
Have a method that prints out the following
For A:  "Class A"
For B:  "Class B"
Make B extend A
From your Main class create an object of the B class and call the methods.
Output:
Class A
Class B
 */
public class Repl149 {
    public static void main(String[] args) {
        B o1=new B();
        o1.ma();
        o1.mb();
    }
}



class A {
    void ma() {
        System.out.println("Class A");
    }
}

class B extends A {
    void mb() {
        System.out.println("Class B");

    }
}