package org.example.number;

public class PerfectNumber {

    public static void main(String[] args) {

        int n=6;


        int sum = 0;
        for (int i = 1; i <6 ; i++) {

            if (n%i==0){

                sum =sum+i;
            }

        }


        if(sum==n){
            System.out.println(" it is perfect number");
        }else {
            System.out.println(" it is not perfect number");
        }

    }
}
