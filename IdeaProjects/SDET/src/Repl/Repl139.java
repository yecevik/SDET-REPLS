package Repl;
/*
Create a method that will be available to all classes in your project with following specifications:
Returns:
a String
Name:
alphabetical
Parameters:
a String called str
Purpose:
Return a string that is composed of each letter as long as the letter is later on in the alphabet
than its previous one.  You can assume actual parameters are lowercase.
See below examples.
Additional Info:
You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater".
Examples:
'a' < 'b' ==> True
'a' < 'a' ==> False
'a' > 'b' ==> False
Examples:
alphabetical("hello") ==> "hlo"
alphabetical("software") ==> "stwr"
alphabetical("language") ==> "lnug"
**Expected Output:**
hlo
stwr
lnug
 */
public class Repl139 {

    String alphabetical(String str){

        String str1="";
        for (int i = 0; i < str.length()-1; i++) {
            if (i==0){
                str1+=str.charAt(i);
            } else if (str.charAt(i+1)>str.charAt(i)) {
                str1+=str.charAt(i+1);
                
            }

        }
return str1;
    }

    public static void main(String[] args) {
        Repl139 ob=new Repl139();
        System.out.println(ob.alphabetical("hello"));
        Repl141 obj=new Repl141();
        obj.maxValue();
    }
}
