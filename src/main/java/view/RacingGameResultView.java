package view;

import model.Car;
import model.RacingGame;

import java.util.List;

public class RacingGameResultView {

    public void printExecutionResultSentence() {
        System.out.println("실행 결과");
    }

    public void printWinnerCar(RacingGame racingGame) {
        List<Car> winnerCarList = racingGame.getWinnerCarList();
        winnerCarList.forEach(car -> System.out.print(car.getName() + " "));
        System.out.println("가 최종 우승했습니다.");
    }

    public void printGameStatus(RacingGame racingGame) {
        racingGame.getCarControllerList().forEach(carController -> carController.printCarStatus());
        System.out.println();
    }

}
