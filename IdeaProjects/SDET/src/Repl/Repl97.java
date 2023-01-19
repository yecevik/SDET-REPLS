package Repl;

import java.util.Scanner;

/*
**For you to do:**
Based on the user inputs program should give a correct answer.
If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
"Proceed with Chrome browser"
If browser is firefox, FIREFOX or FireFOX it should print the:
"Proceed with Firefox browser"
If browser is IE, ie or iE it should print the:
"Proceed with IE browser"
If any other browser it should print the:
"Invalid browser"
 */
public class Repl97 {
    public static void main(String[] args) {

        System.out.println("Enter the name of the browser!:");
        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();
        if(str.equalsIgnoreCase("chrome")){
            System.out.println("Proceed with Chrome browser");
        }else if(str.equalsIgnoreCase("firefox")){
            System.out.println("Proceed with Firefox browser");
        }else if (str.equalsIgnoreCase("ie")){
            System.out.println("Proceed with IE browser");
        }



    }
}
