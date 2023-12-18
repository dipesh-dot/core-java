package org.example.string;

public class CheckPallindromeOfString {
    public static void main(String[] args) {

        String str = "radar";
        boolean b = isPalindrome(str);
        System.out.println(b);
    }

    private static boolean isPalindrome(String str) {
        String reversed = ""; // Initialize an empty string
        int length = str.length() - 1;

        for (int i = length; i >= 0; i--) {
            char ch = str.charAt(i);
            reversed = reversed + ch;
        }

        // Use equals() method for string comparison
        return str.equals(reversed);
    }


    }



