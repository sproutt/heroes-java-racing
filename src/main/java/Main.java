import racingcar.InputView;
import racingcar.RacingGame;
import racingcar.ResultView;
import racingcar.Winners;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        String carNames = InputView.getInputNameOfCars();
        int runNumber = InputView.getInputRunNumber();

        RacingGame racingGame = new RacingGame(carNames, runNumber);
        ResultView.showResultMessage();

        for(int i = 0; i < runNumber; i++) {
            racingGame.move();
            ResultView.showResult(racingGame.getCars());
        }

        Winners winners = new Winners(racingGame.getCars());
        ResultView.showWinner(winners.getCars());

    }
}
