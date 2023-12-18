package org.example.pattern;

public class pyramid3 {
    public static void main(String[] args) {

        int n =3;


        for (int i = 1; i <=n ; i++) {

            for (int k = 1; k <=n-i ; k++) {
                System.out.print("   ");
            }


            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+j+"*");
            }

            for (int l = i-1; l > 0 ; l--) {
                System.out.print("+"+l+"+");
            }
            System.out.println(" ");
        }
    }
}
