package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    public static int createOneRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public static List<Integer> createRandomNumbers(int length) {
        List<Integer> randomNumbers = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            randomNumbers.add(createOneRandomNumber());
        }
        return randomNumbers;
    }
}

