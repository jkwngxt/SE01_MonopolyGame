package ku.cs;

public class Player {
    private String name;
    private Die[] dice;
    private Board board;
    private Piece piece;

    public Player(String name, Die[] dice, Board board) {
        this.name = name;
        this.dice = dice;
        this.board = board;
        piece = new Piece(board.getStartSquares());
    }

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

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }
}
