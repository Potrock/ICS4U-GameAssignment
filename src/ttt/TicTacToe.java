package ttt;

import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 * Created by pwbla on 2018-01-29.
 */
public class TicTacToe extends A_TicTacToe {

    int index = 0;

    TicTacToe() throws Exception {
        tttScene = new Scene(tttRoot, 600, 600);
        initialize();
    }


    @Override
    public void initialize() {
        for (int i = 0; i < 3; i++) {
            tttRoot.add(buttons.get(index), 0, i);
            index++;
        }
        for (int i = 0; i < 3; i++) {
            tttRoot.add(buttons.get(index), 1, i);
            index++;
        }
        for (int i = 0; i < 3; i++) {
            tttRoot.add(buttons.get(index), 2, i);
            index++;
        }
    }
    public Scene getScene() {
        return tttScene;
    }
}
