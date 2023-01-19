package Repl;

/*
 1. Complete the Car.java class:
Create the following variable (**Choose proper datatype**)
* make
* model
* numberOfDoors
* topSpeed
* price
following the proper naming convention for variables.
Write four constructors:
* The first constructor(with all parameters)
* A secondary constructor Have all parameters **except numberOfDoors.
(**numberOfDoors value should assign to 4 inside constructor)
* A third constructor Have all parameters **except make and model .** **
(**make and model value should assign to "unknown" inside constructor)
* A fourth constructor Have all parameters **except topSpeed and price**;**
(**topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)
Create a display method in Cars class to print the class variable value in console.
2. Test your code with the Main.java class:
Create several Car objects using all Constructors.
then call display method with each object.
Output:
Toyota Prius 4 120 30000.0
Toyota Prius 4 120 30000.0
unknown unknown 4 120 30000.0
Toyota Prius 4 90 0.0
 */
public class repl143 {
}

class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Car(String make, String model, int numberOfDoors, int topSpeed, int price){
        this.make=make;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
        this.model=model;
    }
    Car(String make, String model, int topSpeed, int price){
        this.make=make;
        numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;
        this.model=model;
    }
    Car( int numberOfDoors, int topSpeed, int price){
       make="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
        model="unknown";
    }
    Car(String make, String model, int numberOfDoors){
        this.make=make;
        this.numberOfDoors=numberOfDoors;
        topSpeed=90;
        price=0;
        this.model=model;
    }
    void m1(){
        System.out.println(make+" "+ model+" "+ numberOfDoors+" "+ topSpeed+" "+ price);
    }

    public static void main(String[] args) {
        Car o1=new Car("Toyota"," Prius", 4 ,120 ,30000);
        o1.m1();
        Car o2=new Car("Toyota"," Prius",  120 ,30000);
        o2.m1();
        Car o3=new Car(4, 120, 30000);
        o3.m1();
        Car o4=new Car("Toyota"," Prius", 4);
        o4.m1();
    }
}