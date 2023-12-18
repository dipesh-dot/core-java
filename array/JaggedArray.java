package org.example.array;

public class JaggedArray {

    public static void main(String[] args) {

        int rows= 3;
        int[][] arr = new int[3][];
        arr[0]= new int[4];
        arr[1] =new int[3];
        arr[2]= new int[5];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {


                arr[i][j]= (int) (Math.random()*10);
            }
        }
        int targetNumber = 5;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {


                System.out.print(arr[i][j] +"  ");
            }
            System.out.println( " ");
        }

        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {


                if(arr[i][j] ==targetNumber){
                    System.out.println(" found at : "+"row : "+i+" col : "+j);

                }else {

                    System.out.println("not found");

                }
            }
            System.out.println( " ");
        }
    }



}
