
/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;

public class PhraseSolver {
  /* your code here - attributes */
  private String player1;
  private String player2;
  private String board;
  private Boolean solved;

  /* your code here - constructor(s) */
  public PhraseSolver() {
    player1 = null;
    player2 = null;
    board = null;
    solved = false;

  }

  /* your code here - accessor(s) */
  // Gives player1 name
  public String getPlayer1() {
    return player1;
  }
  // Gives player2 name
  public String getPlayer2() {
    return player2;
  }
  // Gives board layout
  public String getBoard() {
    return board;
  }
  // Returns true or fals depending on if phrase is solved
  public Boolean getSolved() {
    return solved;
  }

  /* your code here - mutator(s) */

  public void play() {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);

    boolean correct = true;
    while (!solved) {

      /* your code here - game logic */

      /* your code here - determine how game ends */
      solved = true;
    }

  }

}
