package controller;

import model.Car;
import model.MovingRule;
import model.RandomMovingRule;

import java.util.List;
import java.util.Random;

public class Race {

    private MovingRule randomMovingRule;
    private Random random;

    public Race() {
        random = new Random();
        randomMovingRule = new RandomMovingRule();
    }

    public void registerCars(List<Car> cars, int carsNumber) {
        for (int i = 0; i < carsNumber; i++) {
            cars.add(new Car());
        }
    }

    public void start(List<Car> cars, int tryCount) {
        for(int i = 0; i < tryCount; i++) {
            int randomNumber = random.nextInt(10);
            playOneRound(cars, randomNumber);
        }
    }

    public void playOneRound(List<Car> cars, int randomNumber){
        cars.forEach(car -> {
            if(randomMovingRule.judge(randomNumber)) {
                car.move();
            }
        });
    }
}
