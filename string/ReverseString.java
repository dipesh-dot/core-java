package org.example.string;

import java.util.Arrays;

public class ReverseString {


    public static void main(String[] args) {

        String str = "Dipesh";

        char[] ch =str.toCharArray();
        int len = str.length();
        String result =" ";

        for (int i = len-1; i >=0 ; i--) {



            result = result +ch[i];


        }
        System.out.println(result);
    }
}
