package model;

public class Car{

    long number;
    int length;
    State state;

    public Car(long number) {
        this.number = number;
        length = 0;
    }

    public int moveCount() {
        return length;
    }

    public long getCarNum() {
        return number;
    }

    public void changeState(State cmd) {
        state = cmd;
    }

    public void move() {
        length = state.execute(length);
    }
}