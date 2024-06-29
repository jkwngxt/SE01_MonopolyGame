package ku.cs;

import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;

    public Board() {
        // Default constructor when user does not want to name the squares
        squares = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            squares.add(new Square("No." + (i + 1)));
        }
    }

    public Board(ArrayList<String> squareNames) {
        // Constructor when the user names the squares themselves
        squares = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            squares.add(new Square(squareNames.get(i)));
        }
    }

    public Square getSquare(Square oldLocation, int fvTot) {
        int oldLocIndex = squares.indexOf(oldLocation);
        int newLocIndex = (oldLocIndex + fvTot) % 40;
        return squares.get(newLocIndex);
    }

    public Square getStartSquares() {
        // Start with the first square of the board
        return squares.get(0);
    }

    public void printAllSquaresName() {
        // Print the names of all squares on the board
        System.out.println("All Squares :");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.printf(">> " + squares.get(j * 10 + i).getName() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}




