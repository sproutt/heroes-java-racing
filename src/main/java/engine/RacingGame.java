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
    private InputView inputView;

    public RacingGame() {
        cars = new ArrayList<>();
        carController = new CarController();
        inputView = new InputView();
    }

    public void run() {
        long carNum = inputView.inputTotalCarNum();
        int trial = inputView.inputTotalTrial();

        register(carNum);
        executeGame(trial);
        printAll(cars);
    }

    private void executeGame(int trial) {
        for (int i = 0; i < trial; i++) {
            carController.moveCar(cars);
        }
    }

    private void register(long carNum) {
        carController.registerCars(cars, carNum);
    }

    private void printAll(List<Car> cars) {
        for (Car car : cars) {
            ResultView.printAllCarsState(car.getCarNum(), car.moveCount());
        }
    }
}
