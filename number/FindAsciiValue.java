package org.example.number;

public class FindAsciiValue {
    public static void main(String[] args) {

        char ch ='Z';
        checkAsciiValue(ch);
    }

    private static void checkAsciiValue(char ch) {
        int value = ch;
        System.out.println(" the Ascii Value of : " +ch+ " " +value);
    }
}
