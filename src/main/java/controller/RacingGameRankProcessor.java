package controller;


import model.Car;
import model.RacingGame;

import java.util.List;

public class RacingGameRankProcessor {

    private static final int FIRSTELEMENT = 0;

    public void setWinnerCarList(RacingGame racingGame) {
        List<CarController> carControllerList = racingGame.getCarControllerList();
        Car firstCarInCarControllerList = carControllerList.get(FIRSTELEMENT).getCar();
        racingGame.initializeWinnerCarList(firstCarInCarControllerList);
        for (int iterationCount = 1; iterationCount < carControllerList.size(); iterationCount++) {
            Car car = carControllerList.get(iterationCount).getCar();
            racingGame.updateWinnerCarList(car);
        }
    }
}
