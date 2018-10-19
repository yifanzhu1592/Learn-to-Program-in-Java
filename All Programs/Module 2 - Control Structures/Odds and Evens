// For this project you are going to program a game called "Odds and Evens". The game is similar
// to rock paper scissors. It is played between two players, in your version it will be you versus the
// computer. Each player will choose either "odds" or "evens", since you’re playing the computer
// you will get first pick. Once you have chosen your side, you each choose a number of fingers to
// play- 0 to 5. The winner is determined by whether the sum of your fingers is odd or even
// (depending on what you chose).


import java.util.*;
public class OddsAndEvens {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //intro
        System.out.println("Let's play a game called \"Odds and Evens\"");
        //take in the users name, odds or evens
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String choice = input.next();
        if (choice.equals("O"))
            System.out.println(name + " has picked odds! The computer will be evens.");
        else
            System.out.println(name + " has picked evens! The computer will be odds.");
        System.out.println("---------------------------------------");
        System.out.println();

        //randomizer
        //takes in the number of "fingers" the user would like to play, and uses
        System.out.print("How many \"fingers\" do you put out? ");
        int fingers = input.nextInt();
        // the random generator to decide what the computer will play
        Random random = new Random();
        int computer = random.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\".");
        System.out.println("---------------------------------------");
        System.out.println();

        //sum
        //adds the 2 integers together and produces the sum
        int sum = fingers + computer;
        System.out.println(fingers + " + " + computer + " = " + sum);
        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven)
            System.out.println(sum + " is ...even!");
        else
            System.out.println(sum + " is ...odd!");
        System.out.println("---------------------------------------");
        System.out.println();

        // who wins
        //decided whether the final answer is even or odd, and declares a winner
        if (choice.equals("O") && !oddOrEven){
            System.out.println("That means " + name + " wins! :)");
        }
        else if (choice.equals("O") && oddOrEven){
            System.out.println("That means computer wins! :)");
        }
        else if (choice.equals("E") && !oddOrEven){
            System.out.println("That means computer wins! :)");
        }
        else
            System.out.println("That means " + name + " wins! :)");
    }
}
