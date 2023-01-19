package Repl;
/*
For you to do:
Create the maxValue method that will accept int array and return return the maximum value in the array.
Method should visible every class in any package!
**Expected Output:**
22
 */

public class Repl141 {
    static int[] arr={5,12,-3,7,3,22};
    static int max;
     void maxValue(){
        for ( int a:arr) {
            if (a>max){
                max=a;
            }

        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Repl141 ob=new Repl141();
        ob.maxValue();


    }
}
