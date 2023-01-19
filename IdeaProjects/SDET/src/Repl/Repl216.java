package Repl;
/*
Create an Array of size N whose elements sum to zero
ArraySumToZero(0) ->{}
ArraySumToZero(1) ->{0}
ArraySumToZero(2) ->{-1,1}
ArraySumToZero(3) ->{1,-1,0}
ArraySumToZero(4) ->{2,-2,3,-3}
N will be given as input to the function and fucntion will return
an array whose element will sum to zero.
 */
public class Repl216 {
    public static void main(String[] args) {
        ArraySumToZero();
    }
  static int ArraySumToZero(){
int sum=0;
      int arr[]={2,-2,3,-3};
      for (int i = 0; i < arr.length ; i++) {
sum=sum+arr[i];



      }
      System.out.println(sum);


      return ArraySumToZero();

    }




}
