// For your final project you will be writing the code for "MazeRunner", a program that navigates
// through a given maze. The code for the Maze is already written, and provided in "Maze.java".
// You just need to write the code that uses Maze and decides how to move through it.


import java.util.*;
public class MazeRunner {
    static Maze myMap = new Maze();
    static Scanner input = new Scanner(System.in);
    static String direction = "";
    static int moves = 0;
    static int flag = 0;
    static String choice = "";

    public static void main(String[] args) {
        intro();
        while (!myMap.didIWin()) {
            userMover();
            if (moves == 100)
                return ;
        }
        System.out.println("Congratulations, you made it out alive! And you did it in " + moves +" moves");
    }
    public static void intro(){
        //welcome the user into the program and print the new map.
        System.out.println("Welcome to the Maze Runner!");
        System.out.println("Here is your current position:");
        myMap.printMap();
    }
    public static String userMover(){
        //take in desired direction of move, and check if that direction is valid and possible.

            System.out.print("Where would you like to move? (R, L, U, D) ");
            direction = input.next();
            moves++;
            switch (direction){
                case "R":
                    if (myMap.canIMoveRight()){
                            myMap.moveRight();
                            myMap.printMap();
                    }
                    else {
                        navigatePit("R");
                        if (flag == 0)
                            System.out.println("Sorry, you’ve hit a wall.");
                        flag = 0;
                    }
                    break;
                case "L":
                    if (myMap.canIMoveLeft()){
                            myMap.moveLeft();
                            myMap.printMap();
                    }
                    else {
                        navigatePit("L");
                        if (flag == 0)
                            System.out.println("Sorry, you’ve hit a wall.");
                        flag = 0;
                    }
                    break;
                case "U":
                    if (myMap.canIMoveUp()){
                            myMap.moveUp();
                            myMap.printMap();
                    }
                    else {
                        navigatePit("U");
                        if (flag == 0)
                            System.out.println("Sorry, you’ve hit a wall.");
                        flag = 0;
                    }
                    break;
                case "D":
                    if (myMap.canIMoveDown()){
                            myMap.moveDown();
                            myMap.printMap();
                    }
                    else {
                        navigatePit("D");
                        if (flag == 0)
                            System.out.println("Sorry, you’ve hit a wall.");
                        flag = 0;
                    }
                    break;
                default: System.out.println("Please enter R or L or U or D");
            }
            movesMessage(moves);
            if (moves == 100)
                System.out.println("Sorry, but you didn't escape in time- you lose!");

        return direction;
    }
    public static void movesMessage(int moves){
        //print message after certain number of moves
        //count moves
        if (moves == 50)
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        else if (moves == 75)
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        else if (moves == 90)
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        else if (moves == 100)
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");

    }
    public static void navigatePit(String direction){

        if (myMap.isThereAPit(direction)){
            flag = 1;
            System.out.print("Watch out! There's a pit ahead, jump it? ");
            choice = input.next();
            if (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y'){
                myMap.jumpOverPit(direction);
                myMap.printMap();
            }
        }
    }
}
