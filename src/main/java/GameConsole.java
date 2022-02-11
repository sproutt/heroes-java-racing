import java.util.List;
import java.util.Random;

public class GameConsole {
    private List<Car> carList;
    private int trialCount;

    public void run() {
        init();
        for (int i = 0; i < trialCount; i++) {
            play(carList);
        }
        printResult(carList);
    }

    private void init() {
        carList = CarFactory.createCarList(InputView.inputCarCount());
        trialCount = InputView.inputTrialCount();
    }

    private void play(List<Car> carList) {
        for (Car car : carList) {
            car.move(createRandomValue());
        }
    }

    private void printResult(List<Car> carList) {
        OutputView.showResult();
        for (Car car : carList) {
            OutputView.showCarResult(car.toString());
        }
    }

    public int createRandomValue() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
