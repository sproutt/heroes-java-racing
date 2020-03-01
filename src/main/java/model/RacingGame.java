package model;

import exception.OutOfCarNameLengthException;
import util.RandomNumberGenerator;

import java.util.Comparator;
import java.util.List;

import static util.Converter.convertCarNamesToCarList;

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
        this.cars = convertCarNamesToCarList(carNames);
    }

    public void start() {
        for (int count = 0; count < attemptNumber; count++) {
            proceedOnce(RandomNumberGenerator.createInteger(INTEGER_LIMIT));
        }
    }

    private void proceedOnce(int randomInteger) {
        cars.forEach(car -> car.move(randomInteger, CRITERIA_NUMBER));
    }

    public List<Car> getWinnerCars() {
        List<Car> winnerCars = cars;
        int maxLocation = winnerCars.stream().max(Comparator.comparingInt(Car::getLocation)).get().getLocation();
        winnerCars.removeIf(winnerCar -> winnerCar.getLocation() != maxLocation);
        return winnerCars;
    }

}
