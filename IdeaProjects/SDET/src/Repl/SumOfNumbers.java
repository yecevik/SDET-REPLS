package Repl;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = 0;

        int arr[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println(sum);


        int sum2 = 0;
        int brr[] = {2, 3, 4, 5, 6};
        for (int br:brr) {
            sum2+=br;

        }
        System.out.println(sum2);
    }
}