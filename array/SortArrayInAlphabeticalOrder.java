package org.example.array;


import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class SortArrayInAlphabeticalOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");

        int size = sc.nextInt();
        char[] arr = new char[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter character " + (i + 1) + ": ");
            char ch = sc.next().charAt(0);//charAt(0) helps us in only selecting the oth character
            arr[i] = ch;
        }

        // sort the array in alphabetical order
//        for (int i = 0; i < size - 1; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (arr[i] > arr[j]) {
//                    // Swap characters
//                    char temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }


        System.out.println("-------------------print in desending order-----------------");

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    // Swap characters
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }



        System.out.println("-------------------------- pringting the acending array --------------");

        for (int i = 0; i < size; i++) {
            System.out.print("'" + arr[i] + "' ");
        }
        System.out.println(); // Add a newline after printing the sorted array

    }


}
