package model;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    static final int REFERENCE_NUMBER = 4;

    public List<Car> createCars(String inputCarNames) {
        String[] carNames = util.CarNamesSpliter.splitCarNames(inputCarNames);
        List<Car> cars = new ArrayList<Car>(carNames.length);

        for (int i = 0; i < carNames.length; i++) {
            cars.add(new Car(carNames[i]));
        }
        return cars;
    }

    public List<Car> startRacing(List<Car> cars, List<Integer> randomNumbers) {
        for (int i = 0; i < cars.size(); i++) {
            moveOrStopCar(cars.get(i), randomNumbers.get(i));
        }
        return cars;
    }

    private void moveOrStopCar(Car car, int randomNumber) {
        if (randomNumber >= REFERENCE_NUMBER) {
            car.moveCar();
        }
    }


}

