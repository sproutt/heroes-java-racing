package util;

import java.util.Random;

public class RandomNumberGenerator {
    private static final Random RANDOM = new Random();

    public static int createInteger(int limit) {
        return RANDOM.nextInt(limit);
    }
}
