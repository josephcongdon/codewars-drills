package main;

//Complete the method/function so that it converts dash/underscore delimited words into camel casing.
// The first word within the output should be capitalized only if the original word was capitalized
// (known as Upper Camel Case, also often referred to as Pascal case).

// it needs to camel case after a dash.
// The first letter needs to remain un-capitalized if it is an uncapitalized letter

// So we need to go through the string look at each character. the following character to a _ or a - needs to be set .toUpperCase

public class CamelCase {

    static String toCamelCase(String s){

        for(int i = 0; i >= s.length(); i++){
            char currentChar = s.charAt(i);
            if(currentChar == '-' || currentChar == '_'){

            }
        }

        return "";
    }


}

