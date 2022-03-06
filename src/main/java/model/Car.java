package model;

public class Car {
    private static final int CRITERIA_NUMBER = 4;
    private int position;

    public Car() {
        position = 0;
    }

    public void move(int randomNumber) {
        if(randomNumber >= CRITERIA_NUMBER) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}
