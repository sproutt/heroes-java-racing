package controller;

import model.Car;
import view.InputView;
import view.ResultView;

import java.util.List;
import java.util.Scanner;

public class RacingApplication {
    public static void main(String[] args) throws StringOutOfBoundsException {

        Scanner scanner = new Scanner(System.in);
        RacingGame racingGame = new RacingGame();

        List<Car> cars = RacingGame.generateCars(InputView.inputCarName(scanner));
        int trialCount = InputView.inputNumberOfTrials(scanner);
        for (int i = 0; i < trialCount; i++) {
            racingGame.oneTrial(cars);
            ResultView.printTrialResult(cars);
        }
        ResultView.printFinalWinner(racingGame, cars);
    }
}
