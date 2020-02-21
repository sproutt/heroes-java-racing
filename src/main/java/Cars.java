import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> cars;

    public Cars(String carNames) {
        cars = new ArrayList<>();

        List<String> carNamesList
                = new ArrayList<>(Arrays.asList(carNames.replaceAll(" ", "").split(",")));

        for (String carName : carNamesList) {
            cars.add(new Car(carName));
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public String getCarNames() {
        List<String> carNames = new ArrayList<>();

        for (Car car : cars) {
            carNames.add(car.getName());
        }

        return carNames.stream().collect(Collectors.joining(", "));
    }

    public void move() {
        for (Car car : cars) {
            car.move();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Car car : cars) {
            stringBuilder.append(car.toString() + "\n");
        }

        return stringBuilder.toString();
    }
}
