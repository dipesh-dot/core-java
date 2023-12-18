package org.example.array;

public class FindLargestDifferenceInArray {
    public static void main(String[] args) {

        int[] arr = {11,34,2,65,3,7};

        int greatestDifferenceNumber=0;
        for (int i = 0; i <arr.length ; i++) {

            for (int j = i+1; j < arr.length-i ; j++) {

              int a = arr[i];
              int b = arr[j];
              int c = Math.abs(a-b);
              if (greatestDifferenceNumber<c){
                  greatestDifferenceNumber=c;
              }
            }

        }
        System.out.println("greatest Difference is : "+greatestDifferenceNumber);
    }
}
