package ttt;

/**
 * Created by pwbla on 2018-01-29.
 */
public class Players {
    public enum TURN {
        ONE(1),
        TWO(2);
        int value;
        private TURN(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }


}
