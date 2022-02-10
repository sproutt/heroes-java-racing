public class Car {
    private static final int CAR_PROCEED_CRITERIA = 4;

    private int number;
    private int position;

    public void move(int randomValue) {
        if (randomValue > CAR_PROCEED_CRITERIA) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}
