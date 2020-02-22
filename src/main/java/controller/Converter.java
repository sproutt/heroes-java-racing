package controller;

import model.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class Converter {

    public ArrayList<CarController> convertCarNameStringToCarArrayList(String carNameString) {
        String[] strings = carNameString.split(",");
        CarController[] carControllers = Arrays.stream(strings)
                .map(x -> new CarController(new Car(x)))
                .toArray(CarController[]::new);
        return new ArrayList<CarController>(Arrays.asList(carControllers));
    }
}
