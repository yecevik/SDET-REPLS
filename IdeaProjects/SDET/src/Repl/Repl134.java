package Repl;
/*
Write a method with the following specs:
Returns:
an integer
Name:
countVowels
Parameters:
a String called s
Purpose:

count the number of vowels in the string s.  Assume s is all lowercase.
Examples:
countVowels("obama") ==> 3
countVowels("happy friday! i love weekends") ==> 9
 */
public class Repl134 {
    static String s;
    static int num;

    static void countVowels(String s){

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='u'||s.charAt(i)=='i'||s.charAt(i)=='o'){
                num++;
            }

        }
        System.out.println(num);
        num=0;
    }


    public static void main(String[] args) {
        countVowels("obama");
countVowels("happy friday! i love weekends");

    }
}
