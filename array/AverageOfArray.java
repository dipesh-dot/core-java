package org.example.array;

public class AverageOfArray {
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7,8,9};

        int length= arr.length;
        System.out.println(length);
int sum=0;

        for (int i = 0; i <length ; i++) {

          sum = sum+arr[i];

        }

        System.out.println("sun of the array is : "+sum);

        int average = sum/length;
        System.out.println(average);

    }
}
