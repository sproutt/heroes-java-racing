package controller;

import model.Car;

import java.util.List;

public class CarController {

    public void registerCars(List<Car> cars, long len) {
        for (int i = 0; i < len; i++) {
            cars.add(new Car(i));
        }
    }
}
