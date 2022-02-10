import java.util.List;
import java.util.Random;

public class GameConsole {
    private int numberOfCar;
    private List<Car> carList;
    private int trialCount;

    public void init() {
        numberOfCar = InputView.inputCarCount();
        carList = CarFactory.createCarList(numberOfCar);
        trialCount = InputView.inputTrialCount();
    }

    public int createRandomValue() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public void play() {
        init();

    }
}
