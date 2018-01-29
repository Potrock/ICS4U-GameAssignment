package ttt;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Shape;

/**
 * Created by pwbla on 2018-01-15.
 */
public interface I_Grid {

    int width = 0;
    int length = 0;

    void setWidth(int newWidth);
    void setLength(int newLength);

    void initialize();

    void addObject(Node object, AnchorPane root);



}
