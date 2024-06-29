package ku.cs;

import java.util.ArrayList;

/**
 * This is the Monopoly game class that has 2 dice.
 * @author 6510405377 Jitlada Yotinta
 */
public class MGame {
    private int roundCnt = 0;
    private Die[] dice = new Die[]{new Die(), new Die()};
    private Board board;
    private ArrayList<Player> players = new ArrayList<>();

    /**
     * Create a Monopoly game using default square names.
     */
    public MGame() {
        board = new Board();
    }

    /**
     * Create a Monopoly game using ArrayList of square name.
     * @param squareNames ArrayList of square name
     */
    public MGame(ArrayList<String> squareNames) {
        board = new Board(squareNames);
    }

    /**
     * @param names ArrayList of player name
     */
    public void addNewPlayer(ArrayList<String> names) {
        for (String name : names) {
            Player newPlayer = new Player(name, dice, board);
            players.add(newPlayer);
        }
    }

    /**
     * Play the game for n rounds.
     * @param n Number of rounds to play
     */
    public void playGame(int n) {
        // Print the names of all squares on the board
        board.printAllSquaresName();

        // Play n rounds
        while (roundCnt < n) {
            playRound();
            roundCnt++;
        }
    }

    /**
     * Play one round of the game.
     */
    private void playRound() {

        // Print the round number
        System.out.println("Round " + (roundCnt + 1) + " ------------------");

        for (Player player : players) {
            // Each player takes their turn
            player.takeTurn();

            // Print details about the movement of each player
            String printDetail = player.getName() + " : "
                    + player.getPiece().getLocation().getName()
                    + " (FaceValues = " + dice[0].getFaceValue() + " , " + dice[1].getFaceValue()
                    + ")";
            System.out.println(printDetail);

        }
        // Print the next line for easier reading
        System.out.println();
    }
}
