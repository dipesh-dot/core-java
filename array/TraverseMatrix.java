package org.example.array;

import java.util.Scanner;

public class TraverseMatrix {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println(" Enter the number of columns : ");
        int cols = sc.nextInt();

        //matrix creation step

        int[][] arr = new int[rows][cols];
        int[][] arr1 = new int[cols][rows];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Enter the value at row: "+i+" cols : "+j);
                int value = sc.nextInt();
                arr[i][j]=value;

            }
        }
        //logic to traverse the matrix

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
              int value1 = arr[i][j];
                arr1[j][i]=value1;
            }
        }



        System.out.println("---------------this is orginal matrix----------------");

        //print the matrix

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }


        System.out.println("---------------this is Traversed  matrix----------------");

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                System.out.print(arr1[i][j] + " ");

            }
            System.out.println();
        }

    }
}
