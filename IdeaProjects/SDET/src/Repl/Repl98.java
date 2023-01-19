package Repl;
/*
**For you to do:**
Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
**Expected Output:**
Welcome Syntax family
 */
public class Repl98 {
    public static void main(String[] args) {
        String given="Hello Syntax friends";
String s1=(given.replaceAll("Hello","Welcome"));
        System.out.println(s1.replace("friends","family"));


    }
}
