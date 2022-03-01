package model;

public class Car {
    private int position;

    public Car() {
        position = 0;
    }

    public void move() {
        position++;
    }

    public int getPosition() {
        return position;
    }
}
