package org.example.array;

import java.util.Scanner;

public class AddTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows =sc.nextInt();
        System.out.println("Enter the columns : ");
        int cols =sc.nextInt();


        int arr[][] = new int[rows][cols];
        int arr1[][] = new int[rows][cols];
        int arr2[][] = new int[rows][cols];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                System.out.println("enter the value at arr "+ "i : "+i +" j : "+j);
                arr[i][j]=sc.nextInt();

                System.out.println("enter the value at arr1 "+ "i : "+i +" j : "+j);
                arr1[i][j]=sc.nextInt();

                int a= arr[i][j];
                int b= arr1[i][j];

                arr2[i][j] = a+b;

            }
        }
        System.out.println("___________________the First  matrix is__________________________");


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                System.out.print(arr[i][j]+"  ");

            }
            System.out.println( );
        }


        System.out.println("___________________the second matrix is __________________________");


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length ; j++) {

                System.out.print(arr1[i][j]+"  ");

            }
            System.out.println( );
        }


        System.out.println("___________________the addition of matrix is __________________________");


        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {

                System.out.print(arr2[i][j]+"  ");

            }
            System.out.println( );
        }
    }
}
