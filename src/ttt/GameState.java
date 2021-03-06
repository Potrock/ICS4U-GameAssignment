package ttt;

/**
 * Created by pwbla on 2018-01-30.
 */
class GameState {
    private char[] grid;
    private Players players;

    GameState() {
        //Creates an instance of Players, and creates the grid of characters
        players = new Players();
        grid = new char[9];
    }

    //Checks the legality of the move based on whos turn it is, what button theyre pressing, and where that button is on the grid
    void checkMove(int turn, ttt.Button btn, int location) {
        if (players.getTurn() == 1) { // Player 1 move
            if (btn.returnButton().getText().equals("")) {
                //Allow the move
                btn.returnButton().setText("X");
                players.setTurn(2);
                grid[location] = 'X'; //taken by player1
            }
        } else if (players.getTurn() == 2) { //Player 2 move
            if (btn.returnButton().getText().equals("")) {
                //Allow the move
                btn.returnButton().setText("O");
                players.setTurn(1);
                grid[location] = 'O'; //taken by player2
            }
        }
    }

    /*
    Win cases for X
     */
    boolean checkWin1() {
        return grid[0] == 'X' && grid[1] == 'X' && grid[2] == 'X' ||
                grid[3] == 'X' && grid[4] == 'X' && grid[5] == 'X' ||
                grid[6] == 'X' && grid[7] == 'X' && grid[8] == 'X' ||
                grid[0] == 'X' && grid[3] == 'X' && grid[6] == 'X' ||
                grid[1] == 'X' && grid[4] == 'X' && grid[7] == 'X' ||
                grid[2] == 'X' && grid[5] == 'X' && grid[8] == 'X' ||
                grid[0] == 'X' && grid[4] == 'X' && grid[8] == 'X' ||
                grid[2] == 'X' && grid[4] == 'X' && grid[6] == 'X';
    }

    /*
    Win cases for O
     */
    boolean checkWin2() {
        return grid[0] == 'O' && grid[1] == 'O' && grid[2] == 'O' ||
                grid[3] == 'O' && grid[4] == 'O' && grid[5] == 'O' ||
                grid[6] == 'O' && grid[7] == 'O' && grid[8] == 'O' ||
                grid[0] == 'O' && grid[3] == 'O' && grid[6] == 'O' ||
                grid[1] == 'O' && grid[4] == 'O' && grid[7] == 'O' ||
                grid[2] == 'O' && grid[5] == 'O' && grid[8] == 'O' ||
                grid[0] == 'O' && grid[4] == 'O' && grid[8] == 'O' ||
                grid[2] == 'O' && grid[4] == 'O' && grid[6] == 'O';
    }

    /*
    If there are 9 buttons that no longer have empty text (All full), then it's a tie.
    This only gets called AFTER the program has determined that there is no winner.
     */
    boolean checkTie() {
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (grid[i] != '\u0000') {
                count++;
            }
        }
        return count >= 9;
    }

    /*
    Resets all grid data
    Sets it to X's turn
     */
    void resetGame() {
        for (int i = 0; i < 9; i++) {
            grid[i] = 0;
            players.setTurn(1);
        }
    }
}
