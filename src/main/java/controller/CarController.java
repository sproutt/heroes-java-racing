package controller;

import model.Car;
import view.InputView;
import view.ResultView;

import javax.xml.transform.Result;

public class CarController {
    private Car car;
    private ResultView resultView;

    public CarController(Car car, ResultView resultView) {
        this.car = car;
        this.resultView = new ResultView();
    }


}
