package main;

public class Rental {

    public static int rentalCarCost(int d){
    int totalRent = d * 40;
    if(d >= 7){
    return totalRent - 50;
    }else if(d >= 3 && d <= 6){
        return totalRent - 20;
        }
        return totalRent;
    }

    public static void main(String[] args) {
        System.out.println(rentalCarCost(7));
    }

}
