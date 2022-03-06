package model;

public class RandomMovingRule implements MovingRule {

    private static final int CRITERIA_NUMBER = 4;

    @Override
    public boolean judge(int number) {
        if(number >= CRITERIA_NUMBER) {
            return true;
        }
        return false;
    }
}
