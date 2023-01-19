package Repl;
/*
**For you to do:**
Create two methods:
The first method should be a non-static method that will print out the following message:
"Programming is amazing."
The second method should be a static method that will print out the following message:
"Java is awesome."
Execute both methods
**Expected Output:**
Programming is amazing.
Java is awesome.
 */
public class Repl127 {
    static void m1(){
        System.out.println("Programming is amazing.");
    }
     void m2(){
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args) {
        m1();
        Repl127 obj=new Repl127();
        obj.m2();

    }

}
