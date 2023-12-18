package org.example.array;

import java.util.Scanner;

public class LowerTrangularMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the rows : ");
        int row = sc.nextInt();

        System.out.println("enter the colms : ");
        int col = sc.nextInt();


        int [][] matrix= new int[row][col];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.println("Please enter "+"row : "+i+ "  col : "+j);
                int value = sc.nextInt();

                matrix[i][j]= value;
            }
        }


        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}
