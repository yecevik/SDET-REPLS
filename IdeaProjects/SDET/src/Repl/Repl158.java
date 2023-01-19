package Repl;
/*
# Super Keyword.
# Note: Use separate Classes.
Create Class call Parent.
create a class String **variable** call city.
create Parent constructor take the String parameter city. include the logic to assign the value of parameter to class variable.
create method with below specification.
access modifier public.
return type void
name display
Write to logic print below sentence.
"City name " + the value of class variable.
Create Child Class.
inherit to Parent class.
create Child constructor with one String parameter called city.
call super constructor and pass the parameter.
in Main Class.
Create and object of Child class. pass city name as "Fairfax" and call the display method.
Output.
City name Fairfax
 */
public class Repl158 {
    public static void main(String[] args) {
        Child111 o=new Child111("Fairfax");
        o.display();

    }
}
class P1{
    String city;
    P1(String city){
       this.city=city;
    }
    public void display(){
        System.out.println("City name "+city);

    }

}
class Child111 extends P1{


    Child111(String city) {
        super(city);
    }
}