package org.example.javabasicprogram;

public class SunnyNumber {
    public static void main(String[] args) {

        int number = 80;

        double d,sqr;

        sqr= Math.sqrt(number+1);
        System.out.println(sqr);
        System.out.println(Math.floor(sqr));
        d = sqr-Math.floor(sqr);
        System.out.println(d);
        if(d==0.0)
            System.out.println("sunny number");
        else
            System.out.println("not sunny number");



    }
}
