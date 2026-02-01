package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Lottery rand = new Lottery();
        Ball first = rand.getRandomBall();
        Ball second = rand.getRandomBall();
        Ball third = rand.getRandomBall();

        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());

    }
}
