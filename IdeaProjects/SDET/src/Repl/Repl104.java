package Repl;

/*
**For you to do:**
Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.
Input Example:
John
Jane
Jimmy
Mike
Emily
Expected Output:
**Joh**
**Jan**
**Jim**
**Mik**
**Emi**
 */
public class Repl104 {
    public static void main(String[] args) {
        String[] arr = {"John", "Jane", "Jimmy", "Mike", "Emily" };
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i].substring(0,3));
        }

    }

}
