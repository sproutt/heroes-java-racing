package controller;

import model.Car;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private InputView inputView;
    private OutputView outputView;
    private Race race;
    private List<Car> cars;

    public Game() {
        inputView = new InputView(new Scanner(System.in));
        outputView = new OutputView();
        race = new Race();
        cars = new ArrayList<>();
    }

    public void play() {
        int carsNumber = inputView.inputCarsNumber();
        int tryCount = inputView.inputTryCount();

        race.registerCars(cars, carsNumber);
        race.start(cars, tryCount);

        outputView.printResultMessage();
        for(Car car : cars){
            outputView.printPosition(car.getPosition());
        }
    }
}
