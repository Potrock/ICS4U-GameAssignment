package ttt;

/**
 * Created by pwbla on 2018-01-29.
 */
public class Players {
    public static int turn;

    public Players() {
        turn = 1;
    }


    public void setTurn(int i) {
        turn = i;
    }

    public int getTurn() {
        return this.turn;
    }


}
