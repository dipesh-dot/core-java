package org.example.javabasicprogram;

public class Petersonnumber {
    public static void main(String[] args) {

        //145 = !1 + !4 + !5

        int n = 145;
    int result =petersonNumber(n);
        System.out.println(result);

        if (n==result){
            System.out.println(" yes");
        }else {
            System.out.println("no");
        }

    }

    private static int petersonNumber(int n) {
        int result =0;
        while(n!=0){

            int digit = n%10;
            result = result+factorial(digit);


            n = n/10;
        }

        return result;
    }

    static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        else {
            return (int) n * factorial(n - 1);
        }
    }
}
