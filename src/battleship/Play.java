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
        // makes a textfield to get the input from the user
        inputField = new TextField("");
        inputField.setOnAction(event -> handleInput(inputField.getText()));
        // sets dimensions for the text field
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
        if (choice.length > 2) {
            System.out.println("Input too long, keep it to 2 numbers please.");
        } else {
            // gets integers from the strings and subtracts 1 to get the position of the array
            shootX = Integer.parseInt(choice[0]) - 1;
            shootY = Integer.parseInt(choice[1]) - 1;
            // checks if the shot is within the parameters of the gameboard
            if (shootX >= 0 && shootX <= 4 && shootY >= 0 && shootY <= 4) {
                shoot(shootX, shootY);
            } else {
                System.out.println("Sorry! That coordinate doesn't exist! Try inputting one between 1 and 5");
            }
            inputField.setText("");
        }
    }

    private void shoot(int i, int j) {
        // if the ship is hit, update the character in the location of the shot to an X, if not it is an O
        if (!ship.hit(j, i)) {
            board[j][i] = "X";
        } else {
            board[j][i] = "O";
        }
        // reprints the board after the shot goes off
        for (int a = 0; a < board.length; a++) {
            for (int b = 0; b < board[a].length; b++) {
                System.out.print(board[a][b] + " ");
            }
            System.out.println();
        }
        // checks if the ship is still alive or not
        ((Submarine) ship).hit();
    }

}
