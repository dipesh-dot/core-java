package org.example.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateChar {
    public static <character> void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of chrs array : ");
        int size = sc.nextInt();


        char[] chars = new char[size];
        int[] freq = new int[size];
        System.out.println("------------------------Enter the character  set ---------------");

        for (int i = 0; i < chars.length; i++) {
            System.out.println(" enter the character element : ");
            char ch = sc.next().charAt(0);
            chars[i] = ch;
        }
        Map<Character, Integer> maps = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            if (chars[i] == '*') {

                continue;
            }
            for (int j = i + 1; j < chars.length - i; j++) {

                if (chars[i] == chars[j]) {

                    count++;
                    chars[j] = '*';

                }

            }

            maps.put(Character.valueOf(chars[i]),count);
        }

        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
