package model;

public class Movable implements State {
    @Override
    public int execute(int length) {
        return length + 1;
    }
}
