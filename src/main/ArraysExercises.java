package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArraysExercises {

    public static void main(String[] args) {
//    int[] num = {1,2,3,4,5};
//        String number = Arrays.toString(num);
//        System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("please add a new name to the list: ");
        String input = scanner.nextLine();

        List<Person> people = new ArrayList<Person>();
             people.add(new Person("Sarah"));
             people.add(new Person("Ben"));
             people.add(new Person("Bekah"));
             people.add(new Person("Joe"));
             people.add(new Person("Abby"));
             people.add(new Person("Lydia"));
             people.add(new Person("Caleb"));
             people.add(new Person("Josh"));

            Person p = new Person(input);
            people.add(p);
           for (Person i : people)
        System.out.println(i.getName());

        }


    }


