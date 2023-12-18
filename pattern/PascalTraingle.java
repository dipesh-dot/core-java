package org.example.pattern;

import java.util.Scanner;

public class PascalTraingle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        printPascalTriangle(numRows);
    }

    static void printPascalTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }

    static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
    }


