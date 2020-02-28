package controller;

import model.Car;
import util.RandomGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingGame {

    public static final int CRITICAL_POINT = 5;
    public static final int MAX_NAME_LENGTH = 5;

    public void oneTrial(List<Car> cars){
        for (Car car : cars){
            check(car);
        }
    }

    public void check(Car car){
        if (RandomGenerator.randInt(10) > CRITICAL_POINT){
            car.move();
        }
    }

    public List<String> searchWinners(List<Car> cars){
        List<String> winnerNames = new ArrayList<>();
        int maxPosition = searchMaxPosition(cars);

        for (Car car : cars){
            checkWinner(car, winnerNames, maxPosition);
        }
        return winnerNames;
    }

    public int searchMaxPosition(List<Car> cars){
        List<Integer> carPosition = new ArrayList<>();

        for (Car car : cars){
            carPosition.add(car.getPosition());
        }
        return Collections.max(carPosition);
    }

    public void checkWinner(Car car, List<String> winnerNames, int maxPosition){
        if (car.getPosition() == maxPosition){
            winnerNames.add(car.getName());
        }
    }

    public static List<Car> generateCars(String[] carNames) throws StringOutOfBoundsException{
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames){
            checkNameLength(carName, cars);
        }
        return cars;
    }

    public static void checkNameLength(String carName, List<Car> cars) throws StringOutOfBoundsException {
        if(carName.length() >  MAX_NAME_LENGTH){
            throw new StringOutOfBoundsException();
        }
        cars.add(new Car(carName));
    }
}
