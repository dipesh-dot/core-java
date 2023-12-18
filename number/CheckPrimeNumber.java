package org.example.number;

public class CheckPrimeNumber {
    public static void main(String[] args) {

        giveMePrimeNumber(2, 50);


    }

    private static void giveMePrimeNumber(int start, int end) {
        for (int number = start; number < end; number++) {
            boolean b = IsPrimeNumber(start);
            if (b == true) {
                System.out.println(number);
            } else {
                continue;
            }
        }

    }

    private static boolean IsPrimeNumber(int i) {
        int number = i;
        int temp = 0;

        for (int j = 2; j < number; j++) {

            if (number % j == 0) {
                temp++;
            }
        }
        if (temp > 0) {
            return false;
        } else {
            return true;
        }
    }
}




