package model;

public class Car{

    long number;
    int length;

    public Car(long number) {
        this.number = number;
        length = 0;
    }

    public void moveForward() {
        length++;
    }

    public int moveCount() {
        return length;
    }

    public long getCarNum() {
        return number;
    }
}