package org.example.javabasicprogram;

public class SquareRootOfNumber {

    public static void main(String[] args) {

        int number = 9;

        System.out.println("the square root of " +number+ " is : " +squareRoot(number));
    }

    private static double squareRoot(int number) {

    double t;
    double sqrtroot = number/2;

    do{
        t = sqrtroot;
        sqrtroot=(t+(number/t))/2;
    }
    while((t-sqrtroot)!=0);
    return sqrtroot;
    }
}
