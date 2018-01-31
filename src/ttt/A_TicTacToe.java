package ttt;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pwbla on 2018-01-15.
 */
/*
Abstract class implementing I_CommonGame
 */
public abstract class A_TicTacToe implements I_CommonGame {
    /*
    Creates main scene and gridpane references
    Creates ArrayList of my button class
     */
    Scene tttScene;
    GridPane tttRoot = new GridPane();
    List<ttt.Button> buttons = new ArrayList<ttt.Button>();
    A_TicTacToe() throws Exception {
        //Add 9 buttons to button array
        for (int i = 0; i < 9; i++) {
            buttons.add(i, new ttt.Button(i));
            buttons.get(i).returnButton().setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
            buttons.get(i).returnButton().setMinSize(200, 200);
        }
    }

}
