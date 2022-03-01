package controller;

import function.RandomNumberMaker;
import model.Car;

import java.util.List;

public class CarController {

    private static final int NUMBER_RANGE = 10;
    private static final int MOVE_CONDITION = 4;

    public void registerCars(List<Car> cars, long len) {
        for (int i = 0; i < len; i++) {
            cars.add(new Car(i));
        }
    }

    public void moveCar(List<Car> cars) {
        for (Car car : cars) {
            if(checkMoveOrStop(car)) car.moveForward();
        }
    }

    private boolean checkMoveOrStop(Car car) {
        if (getRandomNumber() >= MOVE_CONDITION) {
            return true;
        }
        return false;
    }

    private int getRandomNumber() {
        return RandomNumberMaker.getRandomNumber(NUMBER_RANGE);
    }
}
