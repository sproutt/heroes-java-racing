import java.util.List;
import java.util.Random;

public class GameConsole {

    public void run() {
        List<Car> carList = CarFactory.createCarList(InputView.inputCarCount());
        int trialCount = InputView.inputTrialCount();
        for (int i = 0; i < trialCount; i++) {
            play(carList);
        }
        printResult(carList);
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

    private int createRandomValue() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
