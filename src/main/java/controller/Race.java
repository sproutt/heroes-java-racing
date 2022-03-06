package controller;

import model.Car;

import java.util.List;
import java.util.Random;

public class Race {

    private Random random;

    public Race() {
        random = new Random();
    }

    public void registerCars(List<Car> cars, int carsNumber) {
        for (int i = 0; i < carsNumber; i++) {
            cars.add(new Car());
        }
    }

    public void start(List<Car> cars, int tryCount) {
        for(int i = 0; i < tryCount; i++) {
            playOneRound(cars);
        }
    }

    public void playOneRound(List<Car> cars){
        cars.forEach(car -> {
            int randomNumber = random.nextInt(10);
            car.move(randomNumber);
        });
    }
}
