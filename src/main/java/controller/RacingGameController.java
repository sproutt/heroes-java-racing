package controller;

import exception.OutOfCarNameLengthException;
import model.RacingGame;
import view.RacingGameInputView;
import view.RacingGameResultView;

import java.util.List;
import java.util.Scanner;

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

    public void set() throws OutOfCarNameLengthException {
        racingGameInputView.printCarNameStringRequestSentence();
        List<CarController> carControllerList =
                converter.convertCarNameStringToCarControllerList(scanner.nextLine());
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
