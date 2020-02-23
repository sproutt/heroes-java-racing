package controller;

import exception.OutOfNameLengthException;
import model.RacingGame;
import view.RacingGameInputView;
import view.RacingGameResultView;

import java.util.*;

public class RacingGameController {

    Scanner scanner;
    Converter converter;
    RacingGame racingGame;
    RacingGameMoveProcessor racingGameMoveProcessor;
    RacingGameRankProcessor racingGameRankProcessor;
    RacingGameInputView racingGameInputView;
    RacingGameResultView racingGameResultView;

    public RacingGameController() {
        scanner = new Scanner(System.in);
        converter = new Converter();
        racingGameMoveProcessor = new RacingGameMoveProcessor();
        racingGameRankProcessor = new RacingGameRankProcessor();
        racingGameInputView = new RacingGameInputView();
        racingGameResultView = new RacingGameResultView();
    }

    public void set() throws OutOfNameLengthException {
        racingGameInputView.printCarNameStringRequestSentence();
        List<CarController> carControllerList =
                converter.convertCarNameStringToCarArrayList(scanner.nextLine());
        racingGameInputView.printNumberOfIterationsRequestSentence();
        int numberOfIterations = scanner.nextInt();
        racingGame = new RacingGame(numberOfIterations, carControllerList);
    }

    public void start() {
        racingGameResultView.printExecutionResultSentence();
        for (int iterationCount = 0; iterationCount < racingGame.getNumberOfIterations(); iterationCount++) {
            racingGameMoveProcessor.moveRandomly(racingGame);
            racingGameResultView.printGameStatus(racingGame);
        }
        racingGameRankProcessor.setWinnerCarList(racingGame);
        racingGameResultView.printWinnerCar(racingGame);
    }
}
