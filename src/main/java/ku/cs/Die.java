package ku.cs;

import java.util.Random;

/**
 * This is the Die class in the Monopoly game. The face values range from 1 to 6.
 * @author 6510405377 Jitlada Yotinta
 */
public class Die {
    private int faceValue;

    /**
     * Constructor. No need to set attribute.
     */
    public Die() {
    }

    /**
     * Assign a new face value by randomly selecting a number between 1 and 6.
     */
    public void roll() {
        Random randomValue = new Random();
        faceValue = randomValue.nextInt(1, 7);
    }

    /**
     * @return face value
     */
    public int getFaceValue() {
        return faceValue;
    }
}
