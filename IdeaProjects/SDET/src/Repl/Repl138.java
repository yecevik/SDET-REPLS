package Repl;
/*
For you to do:
In AnotherClass declare a private, default, protected, public methods and have them each return the
name of the what access modifier they are using.
All methods should be accessible by class name
Call methods of Another class inside Main class
**Expected Output:**
default
protected
public
 */
public class Repl138 {
    public static void main(String[] args) {
        AnotherClass ob1=new AnotherClass();

        ob1.def();
        ob1.prot();
        ob1.pub();

    }
}
 class AnotherClass{

     void def(){
        System.out.println("default");
    }
    public void pub(){
        System.out.println("public");
    }
    protected void prot (){
        System.out.println("protected");
    }

}