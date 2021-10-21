package main;

import java.util.Arrays;

public class Pangram {

    public boolean pangramChecker(String input){
        boolean[] mark = new boolean[26];

        int index = 0;

        for (int i = 0; i < input.length(); i++){


            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                index = input.charAt(i) - 'A';
            } else if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            } else{
                mark[index] = true;
            }
        }

        for (int i = 0; i <= 25; i++){
            if (mark[i] == false){
                return (false);
            }
        }
        return (true);
    }
}
