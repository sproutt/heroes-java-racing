package function;

import java.util.Random;

public class RandomNumberMaker {

    public static int getRandomNumber(int range) {
        return new Random().nextInt(range);
    }
}
