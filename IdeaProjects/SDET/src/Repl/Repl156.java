package Repl;
/*
**For you to do:**
Create class A
declare variable int i=10;
Create class B  extends A
declare variable int i=20;
create a method to display value of variable i from both classes
In Main Class create an object of subclass and call method display
**Expected Output:**
20
10
 */
public class Repl156 {
    public static void main(String[] args) {
        B2 o=new B2();
        o.m();
    }
}
class A2{
    int i=10;

}
class B2 extends A2{
    int i=20;
   void m(){
       System.out.println(i);
       System.out.println(super.i);
   }
}