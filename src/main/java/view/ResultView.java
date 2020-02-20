package view;

import controller.RacingGame;
import model.Car;

import java.util.Collections;

public class ResultView{

    private RacingGame racingGame = new RacingGame();

    public void printTrialResult(){
        for (Car car : racingGame.getCars()){
            System.out.print(car.getName() + " : " + String.join("", Collections.nCopies(car.getPosition(), "*")) + "\n");
        }
        System.out.println();
    }

    public void printFinalWinner(){
        System.out.print(String.join(",",  racingGame.searchWinners()) + "가 최종 우승했습니다.");
    }
}