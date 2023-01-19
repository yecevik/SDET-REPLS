package Repl;

import java.util.Scanner;

/*
**For you to do:**
By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.
First Output: "Enter name of the instructor"
case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
case 2: if User provided the name as Moazzam as input it should show  "Will take care of SDLC Assignment"
case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
Other than these four names if the user provides any other names --> " Invalid instructor selected"
 */
public class Repl40 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter name of the instructor");
        String inst= scan.next();

        switch (inst){
            case"Asghar":
                System.out.println("Will take care of Java Assignment");
                break;

            case"Moazzam":
                System.out.println("Will take care of SDLC Assignment");
                break;
            case"Wegas":
                System.out.println("Will take care of Selenium Assignment");
                break;
            case"Asel":
                System.out.println("Will take care of every Assignment");
                break;
            default:
                throw new RuntimeException("Invalid instructor Name");
            }
        }

    }

