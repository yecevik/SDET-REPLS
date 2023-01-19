package Repl;
/*
**For you to do:**
String “abracadabra alakazam”;
- Print out the position of the first occurrence of "c".
- Print out the position of the first occurrence of " ".
- Print out the position of the first occurrence of the variable target1.
- Print out the position of the first occurrence of the variable target2.
**Expected Output:**
4
11
6
-1
 */
public class Repl93 {
    public static void main(String[] args) {

        String s1="abracadabra alakazam";
        String target1 = "dab";
        String target2 = "aBRA";
        System.out.println(s1.indexOf('c'));
        System.out.println(s1.indexOf(" "));
        System.out.println(s1.indexOf(target1));
        System.out.println(s1.indexOf(target2));
    }
}
