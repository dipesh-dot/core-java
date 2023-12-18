package org.example.javabasicprogram;

public class TechNumber {
    public static void main(String[] args) {
        int number = 2025;

        int lengths = calculateLength(number);
       int  firstHalf = number % (int) Math.pow(10, lengths / 2);
        System.out.println(firstHalf);
       int  secondHalf = number / (int) Math.pow(10, lengths / 2);
        System.out.println(secondHalf);
int sumOfSqr= (firstHalf+secondHalf)*(firstHalf+secondHalf);

if(sumOfSqr ==number){
    System.out.println(" yes  it is tech number");
}else {
    System.out.println(" no it is  mot tech number");
}


    }
    private static int calculateLength(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}
