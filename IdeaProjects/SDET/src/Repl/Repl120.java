package Repl;
/*
**For you to do:**
Declare 3 instance variables to hold:
year, school name and batch #
Access variables from the main method and assign specific values to them
Print values of your variables in the following format:
**Expected Output:**
I am a student of batch 9 studying at Syntax in the year of 2021
 */
public class Repl120 {

static int year;
static int batch;
static String schoolName;

    public static void main(String[] args) {
    year=2021;
    batch=9;
    schoolName="Syntax";

        System.out.println("I am a student of batch "+batch+" studying at "+schoolName+" in the year of "+year );
    }
}
