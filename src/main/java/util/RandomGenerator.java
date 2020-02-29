package util;

import java.util.Random;

public class RandomGenerator {
    public static int randInt(int range){
        return new Random().nextInt(range);
    }
}
