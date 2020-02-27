package model;

public class Car {
    private String carName;
    private int carPosition;

    public Car(String carName) {
        this.carName = carName;
        carPosition = 0;
    }

    public void move() {
        carPosition++;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarPosition() {
        return carPosition;
    }
}
