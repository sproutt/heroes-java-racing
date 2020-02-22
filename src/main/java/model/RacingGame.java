package model;

import controller.CarController;
import view.InputView;

import java.util.*;

public class RacingGame {

    private int numberOfIterations;
    private List<CarController> carControllerList;

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
}
