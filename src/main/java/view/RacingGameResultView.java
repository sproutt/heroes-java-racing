package view;

import model.Car;

public class ResultView {

    public void printCarNameAndLocation(Car car) {
        System.out.print(car.getName() + " : ");
        for (int repeatCount = 0; repeatCount < car.getLocation(); repeatCount++) {
            System.out.print("-");
        }
        System.out.println();
    }

}
