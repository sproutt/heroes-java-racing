import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static List<Car> createCarList(int numberOfCar) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < numberOfCar; i++) {
            Car car = new Car();
            carList.add(car);
        }
        return carList;
    }
}
