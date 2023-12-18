package org.example.array;

public class FrequencyInArray {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};

        int[] fr = new int[arr.length];

        int visited = -1;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==-1){
                continue;
            }

            int count= 1;
            for (int j = i+1; j <fr.length; j++) {


                if (arr[i]==arr[j]) {
                    count++;
                    arr[j]=-1;

                }
            }

            System.out.println("key : "+arr[i] +" frequency : "+ count);

        }
    }
}
