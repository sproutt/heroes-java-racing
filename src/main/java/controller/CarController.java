package controller;

import model.Car;
import view.CarView;

public class CarController {
    private Car car;
    private CarView carView;

    public CarController(Car car) {
        this.car = car;
        carView = new CarView();
    }

    public Car getCar() {
        return car;
    }

    public void moveCarRandomly() {
        int randomIntBetween0And9 = (int) (Math.random() * 9);
        if (randomIntBetween0And9 >= 4) {
            car.move();
        }
    }

    public void printCarStatus() {
        carView.printNameAndLocation(car);
    }
}
