package ttt;

import battleship.Ship;
import battleship.Submarine;

/**
 * Created by pwbla on 2018-01-15.
 */
public interface I_CommonGame {

    int BOARD_SIZE_X = 5;
    int BOARD_SIZE_Y = 5;
    Ship ship = new Submarine();

    void initialize();


}
