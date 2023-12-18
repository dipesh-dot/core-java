package org.example.array;

import java.util.Scanner;

public class CheckArrayBound {
    public static void main(String[] args)throws ArrayIndexOutOfBoundsException  {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the more number of element than mentioned in size");


        try {
            // Forcefully iteration loop no of times

            for (int i = 0; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Print message when any exception occurs
            System.out.println("Array Bounds Exceeded...");
            System.out.println("Try Again");
        }
    }

}

