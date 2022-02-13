import java.util.Random;

public class Game {
    private static final String NEGATIVE_AND_ZERO_NUMBER = "[ERROR] 0 이상의 숫자를 입력해야한다.\n";

    private int numberOfCar;
    private int trialCount;
    private Random random = new Random();

    public Game(int numberOfCar, int trialCount) {
        this.numberOfCar = validatePositive(numberOfCar);
        this.trialCount = validatePositive(trialCount);
    }

    public int validatePositive(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(NEGATIVE_AND_ZERO_NUMBER);
        }
        return number;
    }

    public int createRandomValue() {
        return random.nextInt(10);
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    public int getTrialCount() {
        return trialCount;
    }
}
