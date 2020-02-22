package controller;

import model.Car;
import model.RacingGame;
import view.InputView;

import java.util.List;
import java.util.Scanner;

public class RacingGameController {

    RacingGame racingGame;

    public void init() {
        Scanner scanner = new Scanner(System.in);
        InputView inputView = new InputView();
        inputView.printCarNameStringRequestSentence();
        List<CarController> carControllerList = convertCarNameStringToCarArrayList(scanner.nextLine());
        inputView.printNumberOfIterationsRequestSentence();
        int numberOfIterations = scanner.nextInt();
        racingGame = new RacingGame(numberOfIterations,carControllerList);
    }

    public void start() {

    }

    public static void convertCarNameStringToCarArrayList(String carNameString) {
        String[] stringNameArray = carNameString.split(",");


    }
}
