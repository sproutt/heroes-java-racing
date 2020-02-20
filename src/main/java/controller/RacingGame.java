package controller;

import model.Car;
import view.InputView;
import view.ResultView;

import java.util.ArrayList;
import java.util.Collections;

public class RacingGame {

    private static ArrayList<Car> cars;
    private Trial trial = new Trial();

    public ArrayList<Car> getCars(){
        return cars;
    }

    public void oneTrial(){
        for (Car car : cars){
            trial.move(car);
        }
    }

    public ArrayList<String> searchWinners(){
        ArrayList<Integer> carPosition = new ArrayList<>();
        ArrayList<String> winnerNames = new ArrayList<>();

        for (Car car : cars){
            carPosition.add(car.getPosition());
        }
        int winnerPosition = Collections.max(carPosition);
        for (Car car : cars){
            if (car.getPosition() == winnerPosition){
                winnerNames.add(car.getName());
            }
        }
        return winnerNames;
    }

    public static void main(String[] args) throws Exception{
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        RacingGame racingGame = new RacingGame();

        cars = Car.generateCars(inputView.inputCarName());
        int trialCount = inputView.inputNumberOfTrials();
        for (int i = 0; i < trialCount; i++) {
            racingGame.oneTrial();
            resultView.printTrialResult();
        }
        resultView.printFinalWinner();
    }
}
