package Repl;
/*
Create a method that will do temperature check.
Anytime user passes temperture that is below 32 method should throw an Exception saying "It is freezing"
In Main method call the method and handle an Exception
**Expected Output:**
java.lang.RuntimeException: It is freezing
```
 */
public class Repl213 {


    public static void method(int temp) {
      if (temp < 32) {
            throw new RuntimeException("It's freezing");
        } else {
            System.out.println("its not freezing");
        }

    }
    public static void main(String[] args) {
try{
    method(30);
} catch (Exception e){
    System.out.println(e);
}



    }
}
