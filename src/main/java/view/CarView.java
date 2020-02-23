package view;

import model.Car;

public class CarView {
    public void printNameAndLocation(Car car) {
        System.out.print(car.getName() + " : ");
        for (int iterationCount = 0; iterationCount < car.getLocation(); iterationCount++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
