package ttt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    //    TODO: Integrate kevins battleship
    static TicTacToe ttt;
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

    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.primaryStage = primaryStage;
        primaryStage.show();
        mainScene = new Scene(FXMLLoader.load(getClass().getResource("mainmenu.fxml")));
        A_TicTacToe ttt = new TicTacToe();
        primaryStage.setScene(((TicTacToe) ttt).getScene());
    }
}
