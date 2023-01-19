package Repl;
/*
Create a program that will handle exception to match below output:
Expected Output:
java.lang.ArrayIndexOutOfBoundsException: 4
	at Main.main(Main.java:5)
 */
public class Repl211 {
    public static void main(String[] args) {

        try {
            int[] a = {1};
            System.out.println(a[4]);
        } catch (Exception e){
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");


        }

    }
}
