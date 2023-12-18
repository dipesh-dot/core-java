package org.example.array;

import java.util.Scanner;

public class InterChangeTheDiagonals {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the rows : ");
        int row = sc.nextInt();

        System.out.println("Enter the columns : ");
        int col = sc.nextInt();


        int[][] arr = new int[row][col];


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the value for coordinate  "+"row"+i+"col"+j);
                int value = sc.nextInt();
                arr[i][j]=value;
            }
        }

        System.out.println("---------------print array before the modification --------------");
        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr[i].length ; j++) {

                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println(" ");
        }

        // Logic to Interchange the diagonals
        for (int i = 0; i < arr.length; i++) {
            int lastIndexOfCol = arr[i].length - 1;

            // Swap the diagonal elements
            if (i == 0) {
                int temp = arr[i][i];
                arr[i][i] = arr[i][lastIndexOfCol];
                arr[i][lastIndexOfCol] = temp;
            }

            if (i == 1) {
                int temp = arr[i][i];
                arr[i][i] = arr[i][lastIndexOfCol];
                arr[i][lastIndexOfCol] = temp;
            }

            if (i == 2) {
                int temp = arr[i][i];
                arr[i][i] = arr[i][lastIndexOfCol];
                arr[i][lastIndexOfCol] = temp;
            }
        }

        // Print the array after the modification
        System.out.println("---------------print array after the modification --------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
