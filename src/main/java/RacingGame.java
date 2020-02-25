import java.util.Comparator;
import java.util.List;

public class RacingGame {

    private int iterationNumber;
    private List<Car> cars;

    public RacingGame(int iterationNumber, List<Car> cars) {
        this.iterationNumber = iterationNumber;
        this.cars = cars;
    }

    public int getIterationNumber() {
        return iterationNumber;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void proceedOnce() {
        cars.forEach(car -> car.move((int) (Math.random() * 9)));
    }

    public List<Car> createWinnerCars() {
        List<Car> winnerCars = cars;
        int maxLocation = winnerCars.stream()
                .max(Comparator.comparingInt(Car::getLocation))
                .get()
                .getLocation();
        winnerCars.removeIf(car -> car.getLocation() != maxLocation);
        return winnerCars;
    }
}
