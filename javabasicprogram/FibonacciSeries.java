package org.example.javabasicprogram;

public class FibonacciSeries {
    public static void main(String[] args) {

        int a =0;
        int b=1;
    int n = 6;
        for (int i = 0; i <n ; i++) {

            int temp = a+b;
            System.out.println(a);
            //swap

            a =b;
            b=temp;

        }



    }
}
