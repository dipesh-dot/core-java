package org.example.javabasicprogram;

public class FactorialNumber {
    public static void main(String[] args) {

        //4!=4*3*2*1

        int n = 4;

     int result= factorialCalculator(n);

        System.out.println(result);

    }

    private static int factorialCalculator(int n) {

        int factorial =1;
        while (n!=0){
            factorial = factorial*n;

            n--;
        }
return factorial;
    }
}
