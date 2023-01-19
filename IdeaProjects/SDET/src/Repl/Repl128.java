package Repl;
/*Create a static method with the following specification
Return Type: String
Method Name: mixString
Parameters:
- a String called s1
- a String called s2
Then inside method write logic that will return the strings combined, one letter at a time, starting with s1.  See example below for an example.
NOTE: s1 and s2 should be of equal lengths:
s1 ==> "12345"
s2 ==> "abcde"
mixString(s1,s2) ==> "1a2b3c4d5e"
 */
public class Repl128 {




static String result="";
        static void m1 (String s1, String s2){
            for (int i = 0; i < s1.length() || i < s2.length(); i++) {
                if (i < s1.length())
                    result += s1.charAt(i);
                if (i < s2.length())
                    result += s2.charAt(i);
            }
            System.out.println(result);
        }


    public static void main(String[] args) {

            m1("abcd","1234");
    }
    }
