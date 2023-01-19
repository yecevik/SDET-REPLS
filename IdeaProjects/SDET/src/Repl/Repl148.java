package Repl;

/*
**In ShoppingStore class:**
Create variables as below.
- item,
- price,
- quantity
Create a constructor to initialize instance variables.
Create a method with name itemTotalPrice.
write a logic to to calculate the total values of items in stock. and print the result.
return the total value.
**In Main Class.**
Create two Object of ShoppingStore and pass the parameters to Constructor.
then using each object call the method itemTotalPrice.
Store the returned value of each object.
Calculate sum of both object and print the result.
Output:
Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today
Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,
This Keyword, Method Creation, Mathematic Operations, method return types.
 */
public class Repl148 {
}

class ShoppingStore {
    String item;
    double price;
    int quantity;

    ShoppingStore( String item, double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;

    }

void itemTotalPrice(){
        double total=price*quantity;
    System.out.println(item+ " Total Value "+total);

}

    public static void main(String[] args) {
        ShoppingStore o1=new ShoppingStore("Blanket",9.998,10);
        ShoppingStore o2=new ShoppingStore("Mattress",43.918,10);
        o1.itemTotalPrice();
        o2.itemTotalPrice();
        System.out.println("You purchased "+(o1.price* o1.quantity+o2.price* o2.quantity)+" Today");
    }
}