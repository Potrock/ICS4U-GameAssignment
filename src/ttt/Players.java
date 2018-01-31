package ttt;

/**
 * Created by pwbla on 2018-01-29.
 */
public class Players {
    private static int turn;

    Players() {
        turn = 1;
    }

    int getTurn() {
        return turn;
    }

    void setTurn(int i) {
        turn = i;
    }


}
