package ttt;

import battleship.Gameboard;
import battleship.Play;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    //    TODO: Integrate kevins battleship
    static A_TicTacToe ttt;
    private static Stage primaryStage;
    private static Scene mainScene;

    public static Stage getStage() {
        return primaryStage;
    }

    public static Scene getMainScene() {
        return mainScene;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void playBattleship() {
        System.out.println("Kill the ship to win!");
        System.out.println("Please input coordinates for a shot using integers");
        new Gameboard();
        new Play();
    }

    public static Scene getTTTScene() {
        ((TicTacToe) ttt).resetGame();
        return ((TicTacToe) ttt).getScene();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.primaryStage = primaryStage;
        primaryStage.show();
        mainScene = new Scene(FXMLLoader.load(getClass().getResource("mainmenu.fxml")));
        ttt = new TicTacToe();
        primaryStage.setScene(mainScene);
    }
}
