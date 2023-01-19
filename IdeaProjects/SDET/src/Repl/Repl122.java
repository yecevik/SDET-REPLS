package Repl;
/*
For you to do:
Declare 3 instance variables to hold:
- name of the country
- capital
- population size
Create a method to display values of instance variables
Create 2 Object, assign values to instance variables, execute method display;
**Expected Output:**
The capital of USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000
 */
public class Repl122 {

static String country;
static String cap;
static int pop;

static void m1(String country,String cap,int pop){

    System.out.println("The capital of "+country+" is "+cap+ " and population is " +pop);
}

    static void m2(String country,String cap,int pop){

        System.out.println("The capital of "+country+" is "+cap+ " and population is " +pop);
    }
    public static void main(String[] args) {
m1("USA","Washington DC",330000000);
m2("Kazakhstan","Astana",18500000);
;
    }
}
