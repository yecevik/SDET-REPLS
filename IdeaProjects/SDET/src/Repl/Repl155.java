package Repl;
/*
1. Create three classes (A, B, C)
Write two constructors:
* Have a default constructor that prints out the following
For A:  "I"
For B: "am"
For C: "a tester"
Make C extend B
and B extend A
From your Main class create an object of the C class.
**Expected Output:**
I
am
a tester
 */
public class Repl155 {
}
class A1{
    A1(){
        System.out.println("I");
    }
}
class B1 extends A1{
    B1(){
        super();
        System.out.println("am");

    }
        }
        class C1 extends B1{
    C1() {
        super();
        System.out.println("a tester");
    }
        }
        class main01{
            public static void main(String[] args) {
                C1 o=new C1();
            }

        }