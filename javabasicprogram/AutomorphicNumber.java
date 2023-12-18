package org.example.javabasicprogram;

public class AutomorphicNumber {
    public static void main(String[] args) {


        int number = 25;
        int length = calculateLength(number);

        int result = automorphic(number * number, length);

        if (result == number) {
            System.out.println(" it is automorphic number");
        } else {
            System.out.println("it is not automorphic");
        }
    }

    private static int calculateLength(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    private static int automorphic(int number1, int length) {




        int reversed = 0;
        while (length != 0) {

            int digit = number1 % 10;
            reversed = reversed * 10 + digit;
            number1 = number1 / 10;

            length--;
        }

        int number2 = reverseNumber(reversed);

        return number2;
    }

    private static int reverseNumber(int number) {

        int reversed = 0;

        while (number != 0) {

            int digit = number % 10;

            reversed = reversed * 10 + digit;

            number = number / 10;

        }
        return reversed;
    }
}
