package controller;

import exception.OutOfNameLengthException;
import model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Converter {

    public ArrayList<CarController> convertCarNameStringToCarArrayList(String carNameString) throws OutOfNameLengthException {
        Inspector inspector = new Inspector();
        String[] carNameArray = carNameString.split(",");
        for (String carName : carNameArray) {
            inspector.inspectCarNameLength(carName);
        }
        Stream<String> carNameStream = Arrays.stream(carNameArray);
        CarController[] carControllers = carNameStream
                .map(carName -> new CarController(new Car(carName)))
                .toArray(CarController[]::new);
        return new ArrayList<>(Arrays.asList(carControllers));
    }
}
