package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public Lottery(String res, int num) {
        super(res, num);
    }

    public Lottery() {

    }

    public Ball getRandomBall() {
        int num = new Random().nextInt(100);
        ColorSupplier sup = new ColorSupplier();
        String res = sup.getRandomColor();
        Ball ball = new Ball(res,num);
        return ball;

    }

}
