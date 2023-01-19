package Repl;
/*
**For you to do:**
Declare two static variables to hold
- country name
- continent
Create a method to display the value of static variables in the following format:
____ located on \_\_\_\_ continent
In the main method assign values to a static variable and execute method display
**Expected Output:**
Morocco located on Africa continent
 */
public class Repl129 {

static String name;
static String cont;
static void m1(String name,String cont){
    System.out.println(name+" located on "+cont+" continent");
}

    public static void main(String[] args) {
m1("Morocco","Africa");
    }
}
