package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier color = new ColorSupplier();
    private final int maxBound = 101;

    public Lottery() {

    }

    public Ball getRandomBall() {
        int num = new Random().nextInt(maxBound);
        String res = color.getRandomColor();
        return new Ball(res,num);

    }

}
