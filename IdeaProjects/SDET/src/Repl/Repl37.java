package Repl;

import java.util.Scanner;

/*
**For you to do:**
Take 2 boolean inputs from a user:
"Are you thirsty?"
"Are you sleepy?"
If user is thirsty and not sleepy--> drink=water
If user is thirsty and sleepy--> drink=coffee
If user is not thirsty and sleepy --> drink=tea
Otherwise drink="nothing"
Output:
- Looks like you need to drink \_\_\_
 */
public class Repl37 {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean isThirsty= scan.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean isSleepy= scan.nextBoolean();

        if(isThirsty&&!isSleepy){
            System.out.println("drink=water");

        } else if (isThirsty&&isSleepy) {
            System.out.println("drink=coffee");

        } else if (!isThirsty&&isSleepy) {
            System.out.println("drink=tea");

        }else{
            System.out.println("drink=nothing");
        }
    }
}
