package view;

import controller.RacingGame;
import model.Car;

import java.util.Collections;
import java.util.List;

public class ResultView {

    public static void printTrialResult(List<Car> cars){
        for (Car car : cars){
            System.out.print(car.getName() + " : " + String.join("", Collections.nCopies(car.getPosition(), "*")) + "\n");
        }
        System.out.println();
    }

    public static void printFinalWinner(RacingGame racingGame, List<Car> cars){
        System.out.print(String.join(",",  racingGame.searchWinners(cars)) + "가 최종 우승했습니다.");
    }
}