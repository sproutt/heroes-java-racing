package model;

import exception.OutOfCarNameLengthException;
import util.Converter;
import util.RandomNumberGenerator;

import java.util.Comparator;
import java.util.List;

public class RacingGame {

    private static final int CRITERIA_NUMBER = 4;
    private static final int INTEGER_LIMIT = 10;

    private int attemptNumber;
    private List<Car> cars;

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void set(int attemptNumber, String carNames) throws OutOfCarNameLengthException {
        this.attemptNumber = attemptNumber;
        this.cars = Converter.convertCarNamesToCarList(carNames);
    }

    public void start() {
        for (int count = 0; count < attemptNumber; count++) {
            proceedOnce(RandomNumberGenerator.createIntegers(cars.size(), INTEGER_LIMIT));
        }
    }

    public void proceedOnce(List<Integer> randomIntegers) {
        for (int index = 0; index < cars.size(); index++) {
            cars.get(index).move(randomIntegers.get(index), CRITERIA_NUMBER);
        }
    }

    public List<Car> getWinnerCars() {
        int maxLocation = cars.stream().max(Comparator.comparingInt(Car::getLocation)).get().getLocation();
        cars.removeIf(winnerCar -> winnerCar.getLocation() != maxLocation);
        return cars;
    }
}
