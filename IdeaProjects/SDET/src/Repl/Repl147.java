package Repl;

/*
**In carObject class:**
Create instance variables as below.
- model
- price,
- quantity
Create a constructor that will initialize instance variables.
Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.
run the application in Main Class
**Expected Output:**
Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0
Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
 */
public class Repl147 {
}

class carObject {
    String model;
    double price;
    int quantity;
    carObject( String model, double price, int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }
void carStockValue(){

    System.out.println(model+" Stock Value "+price*quantity);
}

    public static void main(String[] args) {

        carObject o1=new carObject("Toyota 2019",25000,10);
        carObject o2=new carObject("BMW 2019",65298,10);
        o1.carStockValue();
        o2.carStockValue();
    }
}