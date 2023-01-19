package Repl;
/*
Reverse the String without using the Reverse method from the StringBuilder Class
input["I am a java Programmer"] output["Programmer java a am I"]
input["Syntax is Great"] output["Great is Syntax"]
 */
public class Repl226 {
    public static void main(String[] args) {
        String input1 = "I am a java Programmer";
        System.out.println(reverseWords(input1));
    }
    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}




