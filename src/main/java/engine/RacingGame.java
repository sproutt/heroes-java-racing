package engine;

import controller.CarController;
import model.Car;
import view.InputView;
import view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private List<Car> cars;
    private CarController carController;
    private InputView iv;

    public RacingGame() {
        cars = new ArrayList<>();
        carController = new CarController();
        iv = new InputView();
    }

    public void run() {
        long carNum = iv.inputTotalCarNum();
        int trial = iv.inputTotalTrial();

        regist(carNum);
        executeGame(trial);
        printAll(cars);
    }

    private void executeGame(int trial) {
        for (int i = 0; i < trial; i++) {
            carController.moveCar(cars);
        }
    }

    private void regist(long carNum) {
        carController.registerCars(cars, carNum);
    }

    private void printAll(List<Car> cars) {
        for (Car car : cars) {
            ResultView.printAllCarsState(car.getCarNum(), car.moveCount());
        }
    }
}
