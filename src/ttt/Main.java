package ttt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    TicTacToe ttt;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.show();

        ttt = new TicTacToe();
        primaryStage.setScene(ttt.getScene());
    }



    public static void main(String[] args) {
        launch(args);
    }
}
