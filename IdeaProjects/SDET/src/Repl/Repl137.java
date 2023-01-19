package Repl;
/*
For you to do
In main class please declared the variables using different access modifiers that will hold value for:
- name
- city
- name of the school
- batch number
Create a method to display details in following format:
My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
Assign values to the variables and execute method display
**Expected Output:**
My name is John and I live in Miami. I study at Syntax in batch 9
 */
public class Repl137 {

    private String  name="John";
    protected String city="Miami";
    int batch=9;
    public String school="Syntax";

void m1(){
    System.out.println("My name is"+name  +"and I live in "+city+". I study at"+ school +"in batch "+batch);
}
    public static void main(String[] args) {
    Repl137 ob=new Repl137();
    ob.m1();


    }
}
