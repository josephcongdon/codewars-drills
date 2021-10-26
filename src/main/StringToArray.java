package main;

import java.util.Arrays;

public class StringToArray {

        public static String stringToArray(String s) {
            String[] myArr = s.split(" ");
        return Arrays.toString(myArr);
        }

    public static void main(String[] args) {
        System.out.println(stringToArray("A helpful dog enjoys the most bones"));
    }
}
