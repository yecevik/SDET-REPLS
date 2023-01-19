package Repl;
/*
Write a method header with the following specs:
Returns:
a String
Name:
censorLetter
Parameters:
a String
a char
Then complete the method by programming the following behavior
Replace all instances of given character with a "*" within the given String.
See below examples.
Examples:
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
 */
public class Repl119 {


    public static void censorLetter(String str,char c){
        System.out.println(str.replace(c,'*'));


    }



    public static void main(String[] args) {

        censorLetter("computer science",'e');
    }
}
