package Repl;

import java.util.Scanner;
import java.util.SortedMap;

/*
**For you to do:**
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="manual testing"
Otherwise --> subject="Java"
**Output**:
Today you will be learning ____
```
 */
public class Repl38 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Is it weekend?");
        boolean isWeekend= scan.nextBoolean();

        if (!isWeekend){
            System.out.println("subject=manual testing");
        }else {
            System.out.println("subject=Java");
        }


    }
}
