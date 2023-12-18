package org.example.javabasicprogram;

public class FascinatingNumber {
    public static void main(String[] args) {

        int num = 327;
        int num1 = num * 2;
        int num2 = num * 3;

        String str = num + "" + num1 + num2;
        boolean found = true;

        for (char i = '1'; i < '9'; i++) {

            int count = 0;
            for (char j = 0; j < str.length(); j++) {
                char ch = str.charAt(i);

                if (ch == i) {
                    count++;
                }
                if (count > 1 || count == 0) {
                    found = false;
                    break;
                }
            }
        }
    }
}
