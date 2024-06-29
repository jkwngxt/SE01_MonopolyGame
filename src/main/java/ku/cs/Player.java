package ku.cs;

/**
 * This is the Player class that participates in the Monopoly game.
 * @author 6510405377 Jitlada Yotinta
 */
public class Player {
    private String name;
    private Die[] dice;
    private Board board;
    private Piece piece;

    /**
     * @param name Name of the player
     * @param dice Dice of the Monopoly game (MGame)
     * @param board Board of the Monopoly game (MGame)
     */
    public Player(String name, Die[] dice, Board board) {
        this.name = name;
        this.dice = dice;
        this.board = board;
        piece = new Piece(board.getStartSquares());
    }

    /**
     * The player rolls the dice to move their piece.
     */
    public void takeTurn() {
        int fvTot = 0;
        for (Die die : dice) {
            die.roll();
            fvTot += die.getFaceValue();
        }
        Square oldLocation = piece.getLocation();
        Square newLocation = board.getSquare(oldLocation, fvTot);
        piece.setLocation(newLocation);
    }

    /**
     * @return Name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * @return Piece that the player uses in the Monopoly game (MGame).
     */
    public Piece getPiece() {
        return piece;
    }
}
