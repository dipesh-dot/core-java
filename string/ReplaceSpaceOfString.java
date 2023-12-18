package org.example.string;

public class ReplaceSpaceOfString {
    public static void main(String[] args) {

        String str = "My name is peter parkar";
        String resultant = "";
        for (int i = 0; i <str.length() ; i++) {


            char ch = str.charAt(i);
            if (ch==' '){
                continue;
            }
            resultant = resultant+ch;
        }

        System.out.println(" the result string is : "+resultant);
    }


}
