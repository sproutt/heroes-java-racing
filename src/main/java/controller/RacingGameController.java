package controller;

import model.Car;
import model.RacingGame;
import view.InputView;

import java.util.*;

public class RacingGameController {

    RacingGame racingGame;
    Scanner scanner;
    InputView inputView;
    Converter converter;

    public RacingGameController() {
        scanner = new Scanner(System.in);
        inputView = new InputView();
        converter = new Converter();
    }

    public void init() {
        inputView.printCarNameStringRequestSentence();
        List<CarController> carControllerList =
                converter.convertCarNameStringToCarArrayList(scanner.nextLine());
        inputView.printNumberOfIterationsRequestSentence();
        int numberOfIterations = scanner.nextInt();
        racingGame = new RacingGame(numberOfIterations, carControllerList);
    }

    public void start() {

    }



}
