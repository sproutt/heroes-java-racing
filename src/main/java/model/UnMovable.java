package model;

public class UnMovable implements State {
    @Override
    public int execute(int length) {
        return length;
    }
}
