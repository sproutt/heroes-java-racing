package model;

import controller.CarController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RacingGame {

    private int numberOfIterations;
    private List<CarController> carControllerList;
    private List<Car> winnerCarList;

    public RacingGame(int numberOfIterations, List<CarController> carControllerList) {
        this.numberOfIterations = numberOfIterations;
        this.carControllerList = carControllerList;
    }

    public int getNumberOfIterations() {
        return numberOfIterations;
    }

    public List<CarController> getCarControllerList() {
        return carControllerList;
    }

    public void initializeWinnerCarList(Car car) {
        winnerCarList = new ArrayList<>();
        winnerCarList.add(car);
    }

    public List<Car> getWinnerCarList() {
        return winnerCarList;
    }

    public void updateWinnerCarList(Car car) {
        int maxLocationInWinnerCarList = winnerCarList.get(winnerCarList.size() - 1).getLocation();
        if (car.getLocation() == maxLocationInWinnerCarList) {
            winnerCarList.add(car);
        }
        if (car.getLocation() > maxLocationInWinnerCarList) {
            winnerCarList.clear();
            winnerCarList.add(car);
        }
    }
}
