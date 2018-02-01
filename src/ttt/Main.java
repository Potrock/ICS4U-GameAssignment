package ttt;

import battleship.Gameboard;
import battleship.Play;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    /*
    Creates A_TicTacToe reference
     */
    static A_TicTacToe ttt;
    private static Stage primaryStage;
    private static Scene mainScene;

    /*
    Returns the static primaryStage
     */
    static Stage getStage() {
        return primaryStage;
    }

    /*
    returns mainScene
     */
    static Scene getMainScene() {
        return mainScene;
    }

    public static void main(String[] args) {
        launch(args);
    }

    /*
    Executes when the user clicks Battleship on main menu
     */
    static void playBattleship() {
        /*
        Greeting and instructions
         */
        System.out.println("Kill the ship to win!");
        System.out.println("Please input coordinates for a shot using integers");
        /*
        Initializes the game
         */
        new Gameboard();
        /*
        Creates an instance of the game
         */
        Play game = new Play();
        primaryStage.setScene(game.getInputScene());
    }

    /*
    Returns TicTacToe Scene
     */
    static Scene getTTTScene() {
        /*
        !!!DOWNCAST!!!
         */
        ((TicTacToe) ttt).resetGame();
        /*
        ANOTHER DOWNCAST
         */
        return ((TicTacToe) ttt).getScene();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        /*
        Set up primaryStage instance to be the static reference
         */
        Main.primaryStage = primaryStage;
        primaryStage.show();
        /*
        Creates main Scene
         */
        mainScene = new Scene(FXMLLoader.load(getClass().getResource("mainmenu.fxml")));
        /*
        Instantiates Tic Tac Toe
         */
        ttt = new TicTacToe();
        /*
        Sets the stage to the main menu
         */
        primaryStage.setScene(mainScene);
    }
}
