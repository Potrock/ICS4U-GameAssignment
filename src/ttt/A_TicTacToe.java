package ttt;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pwbla on 2018-01-15.
 */
public abstract class A_TicTacToe implements I_Grid {
    Scene tttScene;
    GridPane tttRoot = new GridPane();
    List<Button> buttons = new ArrayList<Button>();
    A_TicTacToe() throws Exception {
        //Add 9 buttons to button array
        for (int i = 0; i < 9; i++) {
            buttons.add(i, new Button(""));
            buttons.get(i).setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
            buttons.get(i).setMinSize(200, 200);
        }
    }

    @Override
    public void setWidth(int newWidth) {
    }

    @Override
    public void setLength(int newLength) {

    }

    @Override
    public void addObject(Node object, AnchorPane root) {
        root.getChildren().add(object);
    }

}
