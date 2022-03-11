package controller;

import function.RandomNumberMaker;
import model.Car;
import model.State;
import model.Movable;
import model.UnMovable;

import java.util.List;

public class CarController {

    private static final int MOVE_CONDITION = 4;

    public void registerCars(List<Car> cars, long len) {
        for (int i = 0; i < len; i++) {
            cars.add(new Car(i));
        }
    }

    public void moveCar(List<Car> cars) {
        for (Car car : cars) {
            car.changeState(checkMoveOrStop(car));
            car.move();
        }
    }

    private State checkMoveOrStop(Car car) {
        if (getRandomNumber() >= MOVE_CONDITION) {
            return new Movable();
        }
        return new UnMovable();
    }

    private int getRandomNumber() {
        return RandomNumberMaker.getRandomNumber();
    }
}
