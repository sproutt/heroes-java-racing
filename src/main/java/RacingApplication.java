import controller.CarController;
import model.Car;
import view.InputView;
import view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class RacingApplication {
    public static void main(String[] args) {
        CarController carController = new CarController();
        InputView iv = new InputView();
        List<Car> cars = new ArrayList<>();

        long carNum = iv.inputTotalCarNum();
        int trial = iv.inputTotalTrial();

        carController.registerCars(cars, carNum);

        for (int i = 0; i < trial; i++) {
            carController.moveCar(cars);
        }

        for (Car car : cars) {
            ResultView.printAllCarsState(car.moveCount());
        }
    }
}
