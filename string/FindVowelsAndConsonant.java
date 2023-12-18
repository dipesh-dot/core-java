package org.example.string;

public class FindVowelsAndConsonant {
    public static void main(String[] args) {

        String str = "My name is king ";
        String resultant = "";
        for (int i = 0; i < str.length(); i++) {


            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            resultant = resultant + ch;
        }
        int length = resultant.length();
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < resultant.length(); i++) {

            char ch = resultant.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            } else {
                count1++;
            }
        }

        System.out.println(" the vowel letter are : " + count);
        System.out.println(" the consonant letter are : " + count1);
        System.out.println(" the length is : "+length);
    }

}
