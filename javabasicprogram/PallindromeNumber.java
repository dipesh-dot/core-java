package org.example.javabasicprogram;

public class PallindromeNumber {

    public static void main(String[] args) {


        int realValue = 12321;


      int result= reversedvalue(realValue);

        System.out.println(result);
      if(result==realValue){
          System.out.println(" it is pallindrome number");
      }else {
          System.out.println(" it is not pallindrome");
      }

    }

    public static int reversedvalue(int realValue) {

        int reversed = 0;
        while (realValue != 0) {
            int digit = realValue % 10;
            reversed = reversed * 10 + digit;

            realValue = realValue / 10;
        }
        return reversed;
    }
}
