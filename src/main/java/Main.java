import racingcar.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        String carNames = InputView.getInputNameOfCars();
        int runNumber = InputView.getInputRunNumber();

        RacingGame racingGame = new RacingGame(carNames, runNumber);
        ResultView.showResultMessage();

        racingGame.start();

        List<Car> carList = racingGame.getCars();
        Winners winners = new Winners(carList);

        List<Car> winnerCarList = winners.getCars();
        ResultView.showWinner(winnerCarList);
    }
}
