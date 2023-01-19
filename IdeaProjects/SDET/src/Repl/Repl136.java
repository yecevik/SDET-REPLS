package Repl;
/*
For you to do:

Please create methods with different access modifiers (one for each access modifier)
and call them properly in main method one by one
In each method write the logic accordingly like for private method write the logic in
the println Statement as "This is Private Method" accordingly for rest of the methods
that have different access modifiers should be a total of 4 outputs, please make sure
they are in the same order that is printed below.
**Expected Output:**
This is Private Method
This is Default Method
This is Protected Method
This is Public Method
 */


public class Repl136 {


    static void m1(){
        System.out.println("This is default");
    }
    private static void m2(){
        System.out.println("This is private");
    }
   public static void m3(){
        System.out.println("This is public");
    }
    protected static void m4(){
        System.out.println("This is protected");
    }
    public static void main(String[] args) {
m1();
m2();
m3();
m4();
    }

}
