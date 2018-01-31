package ttt;

/**
 * Created by pwbla on 2018-01-30.
 */
public class Button extends javafx.scene.control.Button {
    private int location;
    javafx.scene.control.Button btn;
    public Button(int location) {
        btn = new javafx.scene.control.Button("");
        this.location = location;
    }

    public int getLocation() {
        return this.location;
    }

    public void setBtnText(String text) {
        this.btn.setText(text);
    }

    public javafx.scene.control.Button returnButton() {
        return this.btn;
    }
}
