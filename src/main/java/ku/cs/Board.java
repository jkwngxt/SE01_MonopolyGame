package ku.cs;

import java.util.ArrayList;

/**
 * This is the Board class in the Monopoly game that has 40 squares.
 * @author 6510405377 Jitlada Yotinta
 */


public class Board {
    private ArrayList<Square> squares;

    /**
     * Default constructor when user does not want to name the squares.
     */
    public Board() {
        squares = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            squares.add(new Square("No." + (i + 1)));
        }
    }

    /**
     * Constructor when the user names the squares themselves.
     * @param squareNames ArrayList of square name
     */
    public Board(ArrayList<String> squareNames) {
        squares = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            squares.add(new Square(squareNames.get(i)));
        }
    }

    /**
     * Get new square.
     * @param oldLocation Old location of the piece
     * @param fvTot Total face values
     * @return New location of the piece
     */
    public Square getSquare(Square oldLocation, int fvTot) {
        int oldLocIndex = squares.indexOf(oldLocation);
        int newLocIndex = (oldLocIndex + fvTot) % 40;
        return squares.get(newLocIndex);
    }

    /**
     * Start with the first square of the board.
     * @return Start location
     */
    public Square getStartSquares() {
        return squares.get(0);
    }

    /**
     * Print the names of all squares on the board.
     */
    public void printAllSquaresName() {
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




