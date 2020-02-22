package controller;

import model.Car;
import view.InputView;
import view.ResultView;

import javax.xml.transform.Result;

public class CarController {
    private Car car;
    private ResultView resultView;

    public CarController(Car car) {
        this.car = car;
    }


}
