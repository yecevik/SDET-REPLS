package Repl;

import java.util.ArrayList;

public class Repl184WithLoop {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(6);
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);
        for (int i = 0; i <= num.toArray().length - 1; i++) {

            if (i % 2 == 0) {
                System.out.println(num.get(i));

            }


        }


    }


}