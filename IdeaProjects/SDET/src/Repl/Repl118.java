package Repl;
/*
Write a method header on line two with the following specs:
Returns:
a String
Name:
spaceOut
Parameters:
a String
Then complete the method by programming the following behavior
Insert spaces after every character in the String s, then return the new string.
See below examples (note the space at the end as well).
Examples:
spaceOut("hello") ==> "h e l l o "
spaceOut("technology") ==> "t e c h n o l o g y "
 */
public class Repl118 {



public static void spaceOut(String str){

    for (int i = 0; i <str.length() ; i++) {
        System.out.print(str.charAt(i)+" ");

    }
}

    public static void main(String[] args) {
spaceOut("engin");
    }
}
