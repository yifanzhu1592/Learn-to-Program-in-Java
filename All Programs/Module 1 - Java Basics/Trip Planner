// For this project, you are going to write a program that asks the user for some information about
// an international trip they are taking. Based on that information you will need to do some
// conversions, using the correct data types, to tell them some information to help them plan their
// trip.


import java.util.Scanner;

public class TripPlanner {

    public static void main(String[] args){

        intro();
        budget();
        time();
        distance();
    }

    public static void intro(){
        Scanner input = new Scanner(System.in);
        //takes in user name and destination
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String destination = input.nextLine();
        System.out.println("Great! "  + destination + " sounds like a great trip");
        System.out.println("***********");
        System.out.println();
        System.out.println();
    }

    public static void budget(){
        Scanner input = new Scanner(System.in);
        //takes in days planned on trip, allowance, and converting info
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int allowance = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        double rate = input.nextDouble();
        System.out.println();
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes");
        double allowance_per_day = (double) allowance / days;
        System.out.println("If you are going to spend $" + allowance + " USD that means per day you can spend up to $" + allowance_per_day + " USD");
        double budget = allowance * rate;
        double budget_per_day = budget / days;
        System.out.println("Your total budget in " + symbol + " is " + budget + " " + symbol + ", which per day is " + budget_per_day + " " + symbol);
        System.out.println("***********");
        System.out.println();
        System.out.println();
    }

    public static void time(){
        Scanner input = new Scanner(System.in);
        //takes in the time difference between home and destination
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int time_difference = input.nextInt();
        int time_midnight = (time_difference + 24) % 24;
        int time_noon = (time_difference + 36) % 24;
        System.out.println("That means that when it is midnight at home it will be " + time_midnight + ":00 in your travel destination");
        System.out.println("and when it is noon at home it will be " + time_noon + ":00");
        System.out.println("***********");
        System.out.println();
        System.out.println();
    }

    public static void distance(){
        Scanner input = new Scanner(System.in);
        //take in distance between home and destination in square kilometers and
        //converts it into square miles.

        //kilometers*0.62137 = miles
        System.out.print("What is the square area of your destination country in km2? ");
        int km2 = input.nextInt();
        double miles2 = km2 * 0.62137 * 0.62137;
        System.out.println("In miles2 that is " + miles2);
        System.out.println("***********");
        System.out.println();
        System.out.println();
    }
}
