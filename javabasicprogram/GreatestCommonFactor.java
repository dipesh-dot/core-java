package org.example.javabasicprogram;

public class GreatestCommonFactor {
    public static void main(String[] args) {


        int greatestCommonfactor =1;

        int number = 12;
        for (int i = 1; i <number ; i++) {


            if(number%i==0){
                greatestCommonfactor = i;
            }
        }
        System.out.println(greatestCommonfactor);
    }
}
