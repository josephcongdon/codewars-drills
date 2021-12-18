package main;

//Complete the method/function so that it converts dash/underscore delimited words into camel casing.
// The first word within the output should be capitalized only if the original word was capitalized
// (known as Upper Camel Case, also often referred to as Pascal case).

// it needs to camel case after a dash.
// The first letter needs to remain un-capitalized if it is an uncapitalized letter

// So we need to go through the string look at each character. the following character to a _ or a - needs to be set .toUpperCase

import java.util.Locale;

public class CamelCase {

//    public static void toCamelCase(String s){
//        for(int i = 0; i >= s.length(); i++){
//            char currentChar = s.charAt(i);
//            String nextChar = String.valueOf(s.charAt(i + 1));
//            if(currentChar == '-' || currentChar == '_'){
//                System.out.println(nextChar.toUpperCase());
//            }
//        }
//        return;
//    }

    public class ConvertStringToCamelCase {
        public static String toCamelCase(String s) {
            final String regex = "([^a-zA-Z']+)'*\\1*";
            final String[] split = s.split(regex);
            final StringBuilder sb = new StringBuilder();

            for (int i = 0; i < split.length; i++) {
                if (i == 0) {
                    sb.append(split[i]);
                } else if (split[i].length()>0){
                    sb.append(split[i].replaceFirst(split[i].substring(0, 1), split[i].substring(0, 1).toUpperCase()));
                }
            }
            return new String(sb);
        }
    }




    public static void main(String[] args) {
        System.out.println(ConvertStringToCamelCase.toCamelCase("john_lennon"));
    }
}

