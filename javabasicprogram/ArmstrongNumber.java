package org.example.javabasicprogram;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int n =153;

       boolean a = isArmstrongNumber(n);
        System.out.println(a);
    }

    private static boolean isArmstrongNumber(int n) {
        int orginalValue=n;
        int result =0;
        while(n!=0) {
            int digit = n % 10;
            result = result + digit * digit * digit;

            n = n / 10;
        }
if (result==orginalValue)
    return true;
else
    return false;

    }


}
