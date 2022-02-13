import java.util.Random;

public class Game {
    private static final String NEGATIVE_AND_ZERO_NUMBER = "[ERROR] 0 이상의 숫자를 입력해야한다.";

    private int numberOfCar;
    private int trialCount;

    public Game(int numberOfCar, int trialCount) {
        this.numberOfCar = numberOfCar;
        this.trialCount = trialCount;

        validatePositive(numberOfCar);
        validatePositive(trialCount);
    }

    private void validatePositive(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(NEGATIVE_AND_ZERO_NUMBER);
        }
    }

    public int createRandomValue() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    public int getTrialCount() {
        return trialCount;
    }
}
