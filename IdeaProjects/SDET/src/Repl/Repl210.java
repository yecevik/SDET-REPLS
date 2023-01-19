package Repl;
/*Complete the code, handle possible exception
**Expected Output:**
/ by zero
```*/
class Repl210 {
    public static void main(String[] args) {

        int a=10, b=0;
        int result;

      try{  result = a/b;
        System.out.println(result);}
      catch (Exception e){
          System.out.println("/ by zero");
      }
    }
}