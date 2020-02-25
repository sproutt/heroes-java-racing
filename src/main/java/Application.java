import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        Scanner scanner = new Scanner(System.in);
        inputView.printCarNameStringRequestSentence();
        String carNameString = scanner.nextLine();
        inputView.printNumberOfIterationRequestSentence();
        int iterationNumber = scanner.nextInt();
        RacingGame racingGame = new RacingGame(iterationNumber, convertCarNameStringToCarList(carNameString));
        resultView.printExecutionResultSentence();
        for (int iterationCount = 0; iterationCount < racingGame.getIterationNumber(); iterationCount++) {
            racingGame.proceedOnce();
            resultView.printRacingGameStatus(racingGame);
        }
        List<Car> winnerCars = racingGame.createWinnerCars();
        resultView.printRacingGameResult(winnerCars);
    }

    public static List<Car> convertCarNameStringToCarList(String carNameString) {
        String[] carNames = carNameString.split(",");
        return Stream.of(carNames).map(Car::new).collect(Collectors.toList());
    }

}