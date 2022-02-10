public class Car {
    private int number;
    private int position;

    public void move(int randomValue) {
        if (randomValue > 4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}
