package Repl;
/*
In Parent Class.
Create a no-argument constructor and include the logic to print "Parent Constructor without argument"
Create another constructor that takes one parameter of integer type called number.
include the logic to print the value of the number.
In Child class.
Create a Constructor without parameter and include the logic to print "Child Constructor without argument"
Overload the constructor by adding one parameter of type integer
Inside the constructor call the parameterized parent class constructor.
In Main Class.
Create an object of Child without passing any argument.
And then another object of Child class by passing the value "10". run the application.
**Expected Output:**
Parent Constructor without argument
Child Constructor without argument
10
 */
public class Repl154 {
}
class Parent1{

    Parent1(){
        System.out.println("Parent Constructor without argument");
    }
    int number;
    Parent1(int number){
        System.out.println("The value of the number is: "+number);
    }
}
class Child1 extends Parent1{
    Child1(){
        System.out.println("Child Constructor without argument");
    }
    Child1(int number){

       super(number);


    }
}
class Main15{
    public static void main(String[] args) {


    Child1 o=new Child1();
    Child1 o1=new Child1(10);

}}