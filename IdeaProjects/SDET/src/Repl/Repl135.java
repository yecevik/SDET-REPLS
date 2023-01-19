package Repl;
/*
Write a method with the following specs:
Returns:
a String
Name:
surround
Parameters:
a String called s
a String called search_term
Then complete the method by programming the following behavior
Return a new String built from s that has every instance of the search term surrounded by parentheses
See below examples.
Examples:
surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)"
surround("technology",'o') ==> "techn(o)l(o)gy"
 */
public class Repl135 {

    static String s;
    static String  search_term;
    void surround(String s,String search_term){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==search_term.charAt(0)){



            }

        }
        System.out.println(s.replaceAll(search_term,("("+search_term+")")));
    }



    public static void main(String[] args) {
Repl135 obj1=new Repl135();

obj1.surround("abcabcabc","c");
        Repl135 obj2=new Repl135();
        obj2.surround("technology","o");
    }
}
