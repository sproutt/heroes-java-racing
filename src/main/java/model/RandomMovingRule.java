package model;

public class RandomMovingRule implements MovingRule {

    @Override
    public boolean judge(int number) {
        if(number >= 4) {
            return true;
        }
        return false;
    }
}
