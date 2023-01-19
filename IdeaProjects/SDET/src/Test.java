public class Test {


/*In Parent class.

Create a constructor, it will take a String parameter called city.

include the logic of printing the parameter value.

Create another constructor without parameter.

Include the logic of printing "Parent Constructor".

Create a Child Class that should be a subclass of Parent class

Inside child class create a constructor that will make a call to parameterized constructor of the parent class.

In Main class.

Create an Object of the child class by passing String value "Vienna"

**Expected Output:**

```
Vienna
```
 */

}
class Parent{

    String city;
    Parent( String city){

        this.city=city;

    }
    void print() {
        System.out.println(city);
    }

    Parent (){

    }
}
class Child extends Parent{
    Child (String city){

        super(city );
    }

}
class Main1{
    public static void main(String[] args) {
        Child d=new Child("vienna");
d.print();
    }
}