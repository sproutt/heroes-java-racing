public class Application {
    public static void main(String[] args) throws OutOfCarNameLengthException {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        String carNames = inputView.inputCarNames();
        int attemptNumber = inputView.inputAttemptNumber();
        RacingGame racingGame = new RacingGame(attemptNumber, carNames);

        racingGame.start();
        resultView.printRacingGameResult(racingGame);
    }
}