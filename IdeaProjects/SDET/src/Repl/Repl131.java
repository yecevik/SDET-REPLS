package Repl;
/*
Write a method header on line two with the following specs:
Returns:
a String
Name:
thirdLetter
Parameters:
a String called s
Then complete the method by programming the following behavior
Returns every 3rd letter of the String s,
starting from the first letter.
See below examples.
Examples:
thirdLetter("hello there") ==> "hltr"
thirdLetter("technology") ==> "thly"
 */
public class Repl131 {

static String s;

static void thirdLetter(String s){

    for (int i = 0; i <s.length() ; i+=3) {
        System.out.print(s.charAt(i));

    }
}

    public static void main(String[] args) {
thirdLetter("technology");
    }
}
