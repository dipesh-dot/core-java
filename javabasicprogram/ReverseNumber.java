package org.example.javabasicprogram;

public class ReverseNumber {
    public static void main(String[] args) {

        int number =12345;

      int result =  reverseNumber(number);

        System.out.println(result);
    }

    private static int reverseNumber(int number) {

        int reversed=0;

        while(number!=0){

            int digit=number%10;

            reversed = reversed*10+digit;

            number=number/10;

        }
        return reversed;
    }
}
