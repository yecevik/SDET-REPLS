package Repl;
/*
Create Linked List that will store first 10 numbers of fibonacci series

Print number from Linked List 1 by 1 all in 1 line

**Expected Output:**

```
0 1 1 2 3 5 8 13 21 34
```
 */


import java.util.LinkedList;

public class Repl190 {


}

class FibonacciLinkList {

    private LinkedList<Integer> fibonacciList;

    public FibonacciLinkList() {
        this.fibonacciList = new LinkedList<Integer>();
    }

    public LinkedList<Integer> sum() {
        int n, a = 0, b = 0, c = 1;

        for (int i = 1; i <= 11; i++) {
            fibonacciList.add(a);
            a = b;
            b = c;
            c = a + b;
        }
        return fibonacciList;
    }

    public void display() {
        for (int i = 0; i <= fibonacciList.toArray().length - 1; i++) {
            System.out.print(fibonacciList.get(i) + " ");
        }

    }
}

class Main45 {
    public static void main(String[] args) {
        FibonacciLinkList fibonacciList = new FibonacciLinkList();
        fibonacciList.sum();
        fibonacciList.display();
    }
}