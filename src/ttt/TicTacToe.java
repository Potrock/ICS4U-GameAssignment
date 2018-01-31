package ttt;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 * Created by pwbla on 2018-01-29.
 */
public class TicTacToe extends A_TicTacToe {

    private GameState game;
    private Players players = new Players();
    private Scene tttEndOs, tttEndXs;

    TicTacToe() throws Exception {
        tttScene = new Scene(tttRoot, 600, 600);
        AnchorPane tttEndO = FXMLLoader.load(getClass().getResource("owins.fxml"));
        AnchorPane tttEndX = FXMLLoader.load(getClass().getResource("xwins.fxml"));
        tttEndOs = new Scene(tttEndO);
        tttEndXs = new Scene(tttEndX);

        initialize();
        game = new GameState();

    }


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

    private void gameCheck(int num) {
        game.checkMove(players.getTurn(), buttons.get(num), num);
        if (game.checkWin2()) {
            tttRoot.add(new Text("WINNER 2"), 3, 0);
            System.out.println("WINNER O");
            Main.getStage().setScene(tttEndOs);
        }
        if (game.checkWin1()) {
            tttRoot.add(new Text("WINNER 1"), 3, 0);
            Main.getStage().setScene(tttEndXs);
        }
        if (game.checkTie()) {
            //done
        }
    }

    void resetGame() {
        game.resetGame();
        int index = 0;
        for (Button btn : buttons) {
            btn.returnButton().setText("");
        }
    }

    Scene getScene() {
        return tttScene;
    }

    public Scene getEndSceneX() {
        return tttEndXs;
    }

    public Scene getEndSceneO() {
        return tttEndOs;
    }
}
