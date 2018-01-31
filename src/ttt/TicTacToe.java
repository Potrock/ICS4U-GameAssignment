package ttt;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 * Created by pwbla on 2018-01-29.
 */
public class TicTacToe extends A_TicTacToe {

    /*
    Naming:
    - tttEndO/X/T are the panes for the end pages
    - tttEndOs/Xs/Ts is the scene corresponding to the panes above ^^
     */

    AnchorPane tttEndT;
    private GameState game;
    private Players players = new Players();
    private Scene tttEndOs, tttEndXs, tttEndTs;

    TicTacToe() throws Exception {
        tttScene = new Scene(tttRoot, 600, 600);
        AnchorPane tttEndO = FXMLLoader.load(getClass().getResource("owins.fxml"));
        AnchorPane tttEndX = FXMLLoader.load(getClass().getResource("xwins.fxml"));
        AnchorPane tttEndT = FXMLLoader.load(getClass().getResource("tiedmenu.fxml"));
        tttEndTs = new Scene(tttEndT);
        tttEndOs = new Scene(tttEndO);
        tttEndXs = new Scene(tttEndX);


        initialize();
        game = new GameState();

    }


    /*
    Button setup:
    Adds the buttons created in A_TicTacToe contructor to the parent pane
    Sets the EventHandler to check the game when there is a change
     */
    @Override
    public void initialize() {
        //Set up TTT Game
        tttRoot.add(buttons.get(0).returnButton(), 0, 0);
        buttons.get(0).returnButton().setOnAction(event -> gameCheck(0));
        tttRoot.add(buttons.get(1).returnButton(), 0, 1);
        buttons.get(1).returnButton().setOnAction(event -> gameCheck(1));
        tttRoot.add(buttons.get(2).returnButton(), 0, 2);
        buttons.get(2).returnButton().setOnAction(event -> gameCheck(2));
        tttRoot.add(buttons.get(3).returnButton(), 1, 0);
        buttons.get(3).returnButton().setOnAction(event -> gameCheck(3));
        tttRoot.add(buttons.get(4).returnButton(), 1, 1);
        buttons.get(4).returnButton().setOnAction(event -> gameCheck(4));
        tttRoot.add(buttons.get(5).returnButton(), 1, 2);
        buttons.get(5).returnButton().setOnAction(event -> gameCheck(5));
        tttRoot.add(buttons.get(6).returnButton(), 2, 0);
        buttons.get(6).returnButton().setOnAction(event -> gameCheck(6));
        tttRoot.add(buttons.get(7).returnButton(), 2, 1);
        buttons.get(7).returnButton().setOnAction(event -> gameCheck(7));
        tttRoot.add(buttons.get(8).returnButton(), 2, 2);
        buttons.get(8).returnButton().setOnAction(event -> gameCheck(8));
    }

    //Overloaded gameCheck method
    private void gameCheck() {
        System.out.println("You goofed. Use the other one");
    }

    /*
    Overloading gameCheck() method ^^
    checks the legality of the move.
    If O won, act appropriately
    If X won, act appropriately
    Set the stage using the static Main.getStage() method
     */
    private void gameCheck(int num) {
        game.checkMove(players.getTurn(), buttons.get(num), num);
        if (game.checkWin2()) {
            tttRoot.add(new Text("WINNER 2"), 3, 0);
            System.out.println("WINNER O");
            Main.getStage().setScene(tttEndOs);
        } else if (game.checkWin1()) {
            tttRoot.add(new Text("WINNER 1"), 3, 0);
            Main.getStage().setScene(tttEndXs);
        } else if (game.checkTie()) {
            Main.getStage().setScene(tttEndTs);
        }
    }

    /*
    Resets the GameState
    Resets the index for setup again
    Sets all the button text back to nothing
     */
    void resetGame() {
        game.resetGame();
        int index = 0;
        for (Button btn : buttons) {
            btn.returnButton().setText("");
        }
    }

    //Gets the TicTacToe main scene
    Scene getScene() {
        return tttScene;
    }

    //Returns the ending scene for X victory
    public Scene getEndSceneX() {
        return tttEndXs;
    }

    //Returns the ending scene for O victory
    public Scene getEndSceneO() {
        return tttEndOs;
    }
}
