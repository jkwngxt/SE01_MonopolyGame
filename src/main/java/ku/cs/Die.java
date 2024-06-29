package ku.cs;

import java.util.Random;

public class Die {
    private int faceValue;

    public Die() {
    }

    public void roll() {
        Random randomValue = new Random();
        faceValue = randomValue.nextInt(1, 7);
    }

    public int getFaceValue() {
        return faceValue;
    }
}
