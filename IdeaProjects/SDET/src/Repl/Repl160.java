package Repl;
/*
For you to do:
Overload instance method display by having different types of parameters
Inside each method write the logic to print value of the parameter
Call all methods inside your main method
**Expected Output:**
100
Syntax Technologies
100.09
 */
public class Repl160 {

    public static void main(String[] args) {
        Repl160 o=new Repl160();
        o.display(100);
        o.display("Syntax Technologies");
        o.display(100.09);
    }

    void display(int a){
        System.out.println(a);

    }
    void display(String b){
        System.out.println(b);

    }
    void display(double c){
        System.out.println(c);

    }
}
