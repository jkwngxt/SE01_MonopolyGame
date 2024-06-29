package ku.cs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declare Monopoly game variable
        MGame mGame;

        // Declare a Scanner variable to get input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Greeting
        System.out.println("Hi! Welcome to the Monopoly Game! ^0^");
        System.out.println("First, let's start creating the Monopoly game that you want to play.\n");

        // Naming option
        System.out.println("Do you want to name the squares yourself or use default names? (40 squares)");
        System.out.println("   D)efault");
        System.out.println("   N)ame");

        String squaresNameOp;

        // Repeat until the user inputs D or N
        do {
            System.out.print(">>> ");
            squaresNameOp = scanner.next();
        } while (!(squaresNameOp.equalsIgnoreCase("D") || squaresNameOp.equalsIgnoreCase("N")));

        if (squaresNameOp.equalsIgnoreCase("N")) {
            ArrayList<String> squareNames = new ArrayList<>();
            int iSquareName = 0;

            // Users cannot use a name that has already been used
            while (iSquareName < 40) {
                String inputName = scanner.next();
                if (squareNames.contains(inputName)) {
                    System.out.println("Error : The name is already taken. Please choose a different name.");
                } else {
                    squareNames.add(inputName);
                    iSquareName++;
                }
            }

            // Create the Monopoly game by naming the squares
            mGame = new MGame(squareNames);
        } else {
            // Create the Monopoly game by default name
            mGame = new MGame();
        }

        int playersNum;
        ArrayList<String> playerNames = new ArrayList<>();

        // Repeat until the user inputs a number between 2 and 8
        do {
            System.out.print("Number of players (2-8) : ");
            playersNum = scanner.nextInt();
        } while (playersNum < 2 || playersNum > 8);

        // Get input for the player's name
        // Users cannot use a name that has already been used
        int iPlayerName = 0;
        while (iPlayerName < playersNum) {
            System.out.print("Player " + (iPlayerName + 1) + ": ");
            String nameInput = scanner.next();

            if (playerNames.contains(nameInput)) {
                System.out.println("Error : The name is already taken. Please choose a different name.");
            } else {
                playerNames.add(nameInput);
                iPlayerName++;
            }
        }

        // Add the players to the Monopoly game
        mGame.addNewPlayer(playerNames);

        // Get input for the number of rounds to play
        System.out.print("How many rounds do you want to play? : ");
        int round = scanner.nextInt();

        // Close the scanner because there will be no more input
        scanner.close();

        // Play game
        mGame.playGame(round);

        // End game
        System.out.println("Thank you for playing!!");

        //Jitlada Yotinta
    }
}