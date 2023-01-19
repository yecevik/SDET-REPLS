package Repl;
/*
# How would you reverse a String using StringBuffer Class
Given String = "Hello Friends"
**Expected Output:**
sdneirF olleH
 */
public class Repl107 {
    public static void main(String[] args) {


        String str ="Hello Friends";

        StringBuffer sss=new StringBuffer(str);
        System.out.println(sss.reverse());
    }

}
