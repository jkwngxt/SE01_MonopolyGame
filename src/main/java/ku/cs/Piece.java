package ku.cs;

/**
 * This is the Piece class that the player uses in the Monopoly game.
 * @author 6510405377 Jitlada Yotinta
 */
public class Piece {
    private Square location;

    /**
     * @param location First location in the board of Monopoly game (MGame)
     */
    public Piece(Square location) {
        this.location = location;
    }

    /**
     * @return The square where the piece is currently located.
     */
    public Square getLocation() {
        return location;
    }

    /**
     * Set new square where the piece is located.
     * @param location The square where the piece is currently located.
     */
    public void setLocation(Square location) {
        this.location = location;
    }
}
