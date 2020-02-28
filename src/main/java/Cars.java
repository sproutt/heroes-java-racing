import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(String carNames) {
        cars = new ArrayList<>();

        List<String> carNameCollection
                = Arrays.asList(carNames.replaceAll(" ", "").split(","));

        for (String carName : carNameCollection) {
            generateCarWithValidName(carName);
        }
    }

    public Cars(Cars cars) {
        this.cars = new ArrayList<>(cars.getCars());
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> getCarNames() {
        List<String> carNames = new ArrayList<>();

        for (Car car : cars) {
            carNames.add(car.getName());
        }

        return carNames;
    }

    public void move() {
        for (Car car : cars) {
            car.move(RandomGenerator.nextInt(10));
        }
    }

    private void generateCarWithValidName(String carName) {
        try {
            cars.add(new Car(carName));
        } catch (OutOfLengthException e) {
            e.printStackTrace();
        }
    }
}