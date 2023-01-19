package Repl;

import org.w3c.dom.css.CSSStyleDeclaration;

/*
Step 1: Complete the StoreProduct.java class:
Create below instance variables. (Choose proper datatype and naming convention for variable )
* label
* price
* category
* hasExpiration
* stock (represent the stock quantity)
Step 2: Write three constructors:
* The main constructor( with all parameters)
* Second constructor with all parameters except category and hasExpiration
(category defaults to "misc", hasExpiration defaults to false inside constructor)
* Third constructor all the parameters except category, expiration,
and stock (stock default to 0 inside the constructor)
Step 3: Method for display out put.
in StoreProduct Class create a method to display the output of class variables.
(Output sequence as as order of variable shown above. all in one line)
Step 4: in Main Class Create an object of StoreProduct Class with each constructors.
pass the values and then call the display method.
Step 5: Execute your application :)
Hint: each variable must be object specific
Output:
Eggs 3.0 Produce true 10
Paper Towels 2.0 misc false 24
Paper Towels 2.0 null false 0
 */
public class Repl144 {
}

class StoreProduct {
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    StoreProduct(String label, int price, int stock) {
        this.label = label;
        this.price = price;
        category = "misc";
        hasExpiration = false;
        this.stock = stock;
    }
    StoreProduct(String label, int price) {
        this.label = label;
        this.price = price;
         stock=0;
    }
    void m1(){
        System.out.println(label+" "+ price+" "+ category+" "+  hasExpiration+" "+ stock);
    }

    public static void main(String[] args) {

        StoreProduct o1=new StoreProduct("Eggs", 3, "Produce", true, 10);
        o1.m1();
        StoreProduct o2=new StoreProduct("Paper Towels", 2,   24);
        o2.m1();
        StoreProduct o3=new StoreProduct("Paper Towels", 2);
        o3.m1();
    }
}