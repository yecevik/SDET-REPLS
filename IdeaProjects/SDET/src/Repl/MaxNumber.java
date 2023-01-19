package Repl;

public class MaxNumber {
    public static void main(String[] args) {

        int max=0;
        int arr[]={5,6,7,8,2,7};

        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];}


        }
        System.out.println(max);
    }
}
