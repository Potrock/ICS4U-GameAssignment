package battleship;

import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import ttt.I_CommonGame;

public class Play extends Gameboard implements I_CommonGame {
    Scene inputScene;
    AnchorPane parent;
    TextField inputField;
    private int shootX;
    private int shootY;

    public Play() {
        Text greeting = new Text("Please input your shot coordinates in the format \"X Y\"");
        greeting.setFont(Font.font("Arial", 20));
        greeting.setTranslateY(100);
        greeting.setTranslateX(50);
        inputField = new TextField("");
        inputField.setOnAction(event -> handleInput(inputField.getText()));
        inputField.setPrefWidth(500);
        inputField.setPrefHeight(100);
        inputField.setTranslateX(50);
        inputField.setTranslateY(150);
        parent = new AnchorPane();
        parent.getChildren().add(inputField);
        parent.getChildren().add(greeting);
        inputScene = new Scene(parent, 600, 300);
    }

    public Scene getInputScene() {
        return inputScene;
    }

    private void handleInput(String input) {
        String[] choice = input.split(" ");
        shootX = Integer.parseInt(choice[0]) - 1;
        shootY = Integer.parseInt(choice[1]) - 1;
        if (shootX >= 0 && shootX < 4 && shootY >= 0 && shootY < 4) {
            shoot(shootX, shootY);
        } else {
            System.out.println("Sorry! That coordinate doesn't exist! Try inputting one between 0 and 4");
        }
        inputField.setText("");
    }

    private void shoot(int i, int j) {
        if (!ship.hit(j, i)) {
            board[j][i] = "X";
        } else {
            board[j][i] = "O";
        }
        for (int a = 0; a < board.length; a++) {
            for (int b = 0; b < board[a].length; b++) {
                System.out.print(board[a][b] + " ");
            }
            System.out.println();
        }
        ((Submarine) ship).hit();
    }

}