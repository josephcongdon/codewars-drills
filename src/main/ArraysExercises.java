package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArraysExercises {

    public static void main(String[] args) {
//    int[] num = {1,2,3,4,5};
//        String number = Arrays.toString(num);
//        System.out.println(number);

        Scanner scanner = new Scanner(System.in);




        Person[] person = {
         new Person ("Sarah"),
         new Person ("Ben"),
         new Person ("Bekah"),
         new Person ("Joe"),
         new Person ("Abby"),
         new Person ("Lydia"),
         new Person ("Caleb"),
         new Person ("Josh")
        };
            for(Person p : person){
                System.out.println(p.getName());
            }
        }


    }


