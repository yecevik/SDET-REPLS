package Repl;
/*
Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
In main method execute all 3 methods to match the output:
Expected Output
40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)
20 (should come from subtracting 2 numbers)
 */
public class Repl159 {

    public static void main(String[] args) {
        Repl159 o=new Repl159();
        o.two(100,60);
        o.three(100,60,10);
        o.four(100,60,6,14);
    }

    void two(int a,int b){
        System.out.println(a-b);

    }
    void three(int a,int b,int c){
        System.out.println(a-b-c);

    }
    void four(int a,int b,int c,int d){
        System.out.println(a-b-c-d);

    }

}
