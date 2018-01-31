package ttt;

/**
 * Created by pwbla on 2018-01-30.
 */
public class Button extends javafx.scene.control.Button {
    javafx.scene.control.Button btn;
    private int location;
    public Button(int location) {
        btn = new javafx.scene.control.Button("");
        this.location = location;
    }

    public javafx.scene.control.Button returnButton() {
        return this.btn;
    }
}
