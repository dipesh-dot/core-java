package org.example.array;

import java.util.Scanner;

public class FindSparseMatrix {
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

        int count =0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                if (arr[i][j]==0){
                    count++;
                }
            }
        }

        int numRows = arr.length;
        int numCols = arr[0].length;
        int noOfElement = numRows*numCols;
        System.out.println("Number of element is : "+noOfElement);
        System.out.println(" number of zero : "+count);
        int numOfZero = count;
         if(numOfZero>(noOfElement)/2){
             System.out.println(" it is  sparse matrix");
         }else {
             System.out.println(" it is not sparse matrix");
         }

    }
}
