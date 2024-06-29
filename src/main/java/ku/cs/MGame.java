package ku.cs;

import java.util.ArrayList;

public class MGame {
    private int roundCnt = 0;
    private Die[] dice = new Die[]{new Die(), new Die()};
    private Board board;
    private ArrayList<Player> players = new ArrayList<>();

    public MGame() {
        board = new Board();
    }

    public MGame(ArrayList<String> squareNames) {
        board = new Board(squareNames);
    }

    public void addNewPlayer(ArrayList<String> names) {
        for (String name : names) {
            Player newPlayer = new Player(name, dice, board);
            players.add(newPlayer);
        }
    }

    public void playGame(int n) {
        // Print the names of all squares on the board
        board.printAllSquaresName();

        // Play n rounds
        while (roundCnt < n) {
            playRound();
            roundCnt++;
        }
    }

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
