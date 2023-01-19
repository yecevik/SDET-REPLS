package Repl;
/*
Reverse the number
Input[123] ->output [321]
Input[12345] ->output [54321]
Input[1001] ->output [1001]
Input[789] ->output [987]
 */
public class Repl225 {
    static int reverseInteger(int N)
    {
        int rev_num = 0;
        while (N > 0) {
            rev_num = rev_num * 10 + N % 10;
            N = N / 10;
        }
        return rev_num;
    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 123446789;
        System.out.println("Reverse of no. is "
                + reverseInteger(N));
    }
}