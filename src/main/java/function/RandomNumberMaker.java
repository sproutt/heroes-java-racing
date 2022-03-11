package function;

import java.util.Random;

public class RandomNumberMaker {

    private static final Random random = new Random();
    private static final int RANDOM_NUMBER_RANGE = 10;

    public static int getRandomNumber() {
        return random.nextInt(RANDOM_NUMBER_RANGE);
    }
}
