public class Alistirmalar {


}
class Main{

    public static void main(String[] args) {

        StoreProduct st1 = new StoreProduct("Eggs", 3, "produce", true, 10);
        StoreProduct st2 = new StoreProduct("Paper Towels", 2, 24);
        StoreProduct st3 = new StoreProduct("Paper Towels", 2);

    }}
class StoreProduct{

   String label="Paper Towels";

        double price;


        String category;


        boolean hasExpiration;

        int stock;


        StoreProduct (String label, double price, String category, boolean hasExpiration,int stock){
            label ="Eggs";
            price=3;
            category="Produce";
            hasExpiration=true;
            stock=10;
            System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);

        }
    StoreProduct (String label, double price,int stock){

            category="misc";
           this.hasExpiration= hasExpiration;
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);

    }
    StoreProduct (String label, double price ){

            this.stock=stock;
        this.category=category;
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
this.category=category;
    }
    }


/*Step 1: Complete the StoreProduct.java class:

        Create below instance variables. (Choose proper datatype and naming convention for variable )

        * label

        * price

        * category

        * hasExpiration

        * stock (represent the stock quantity)

        Step 2: Write three constructors:

        * The main constructor( with all parameters)

        * Second constructor with all parameters except category and hasExpiration (category defaults to "misc", hasExpiration defaults to false inside constructor)

        * Third constructor all the parameters except category, expiration, and stock (stock default to 0 inside the constructor)

        Step 3: Method for display out put.

        in StoreProduct Class create a method to display the output of class variables. (Output sequence as as order of variable shown above. all in one line)

        Step 4: in Main Class Create an object of StoreProduct Class with each constructors.

        pass the values and then call the display method.

        Step 5: Execute your application :)

        Hint: each variable must be object specific

        Output:
        Eggs 3.0 Produce true 10
        Paper Towels 2.0 misc false 24
        Paper Towels 2.0 null false 0
        ```*/

