package Repl;
/*
**For you to do:**
Create a variable that will hold the count of all instances of the Main class
Create 3 Object of the class and print value of the count variable;
**Expected Output:**
3
 */
public class Repl126 {

    static  int counter;{
        counter++;
    }
    void display1() {
    }

    public static void main(String[] args) {
        Repl126 obj1=new Repl126();
        obj1.display1();
        Repl126 obj2=new Repl126();
        obj2.display1();
        Repl126 obj3=new Repl126();
        obj3.display1();
        System.out.println(counter);
    }
}
