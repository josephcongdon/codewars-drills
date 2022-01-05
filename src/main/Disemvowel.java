package main;

public class Disemvowel {

    public class Troll {
        public static String disemvowel(String str) {
            str = str.replaceAll("[AEIOUaeiou]", "");
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println(Troll.disemvowel("Happy Birthday"));
    }
}
