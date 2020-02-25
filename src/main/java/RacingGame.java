import java.util.List;
import java.util.Optional;

public class RacingGame {

    private static final int FIRST_ELEMENT = 0;
    private int iterationNumber;
    private List<Car> cars;
    private List<Car> winnerCars;

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

    public List<Car> getWinnerCars() {
        return winnerCars;
    }

    public void proceedOnce() {
        cars.forEach(car -> car.moveRandomly((int) (Math.random() * 9)));
    }

    public void setWinnerCars() {
        winnerCars = cars;
        int maxLocation = winnerCars.stream().max((car1, car2) ->
                car1.getLocation() - car2.getLocation()).get().getLocation();
        winnerCars.removeIf(car -> car.getLocation() != maxLocation);
    }
}
