import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingGame {

    private static final int CRITERIA_NUMBER = 4;

    private int attemptNumber;
    private List<Car> cars;
    Random random;

    public RacingGame(int attemptNumber, String carNames) throws OutOfCarNameLengthException {
        this.attemptNumber = attemptNumber;
        this.cars = convertCarNamesToCarList(carNames);
        random = new Random();
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void start() {
        for (int count = 0; count < attemptNumber; count++) {
            proceedOnce();
        }
    }

    private List<Car> convertCarNamesToCarList(String carNames) throws OutOfCarNameLengthException {
        String[] carNameArray = carNames.split(",");
        for (String carName : carNameArray) {
            inspectCarNameLength(carName);
        }
        return Stream.of(carNameArray).map(Car::new).collect(Collectors.toList());
    }

    private void inspectCarNameLength(String carName) throws OutOfCarNameLengthException {
        if (carName.length() > 5) {
            throw new OutOfCarNameLengthException("자동차 이름은 5글자 이하여야 합니다.");
        }
    }

    private void proceedOnce() {
        cars.forEach(car -> car.move(random.nextInt(10), CRITERIA_NUMBER));
    }
}
