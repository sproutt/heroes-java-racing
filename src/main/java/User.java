public class User {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame(InputView.scanCarNames(), InputView.scanTrialTime());

        ResultView.printExecutionMessage();
        racingGame.startGame();
        ResultView.printResult(racingGame);
        ResultView.printWinner(racingGame.getWinner());
    }
}