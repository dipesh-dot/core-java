package org.example.string;

import java.util.Arrays;

public class SubsetOfString {
    public static void main(String[] args) {

        String str = "Dipesh";
        int length = str.length();
        int size = (length*(length+1))/2;

        int temp = 0;
        String[] arr = new String[size];
        for (int i = 0; i <length ; i++) {
            for (int j = i+1; j <=length ; j++) {
                arr[temp] = str.substring(i,j);
                temp++;

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
