package ttt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

/*
Controller for handing button presses in FXML scenes
 */
public class Controller {
    @FXML
    private javafx.scene.control.Button mainmenubtn;

    @FXML
    private javafx.scene.control.Button tttBtn;

    @FXML
    private javafx.scene.control.Button battleshipBtn;

    @FXML
    void onMainMenu(ActionEvent event) throws IOException {
        Main.getStage().setScene(Main.getMainScene());
    }

    @FXML
    void a_tttBtn(ActionEvent event) throws IOException {
        Main.getStage().setScene(Main.getTTTScene());
    }

    @FXML
    void a_battleshipBtn(ActionEvent event) throws IOException {
        Main.playBattleship();
    }
}
