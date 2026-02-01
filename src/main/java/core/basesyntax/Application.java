package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Lottery rand = new Lottery();
        Ball[] arr = new Ball[3];
        for (int i = 0;i < 3;i++) {
            arr[i] = rand.getRandomBall();
        }

        for (int i = 0;i < 3;i++) {
            System.out.println(arr[i].toString());
        }
    }
}
