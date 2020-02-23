package model;

public class Car {
    private String carName;
    private int carPosition;

    public Car(String carName) {
        this.carName = carName;
        carPosition = 0;
    }

    public void moveCar() {
        carPosition++;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarPosition() {
        return carPosition;
    }

    public String visualizePosition() {
        StringBuilder racingBar = new StringBuilder();
        racingBar.append(carName + ": ");
        for (int i = 0; i < carPosition; i++) {
            racingBar.append("-");
        }
        return racingBar.toString();
    }
}
