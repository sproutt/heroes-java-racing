package car;

public class Car {
    private static final int CAR_PROCEED_CRITERIA = 4;
    private static final String POSITION_HYPHON = "-";

    private int position;

    public void move(int randomValue) {
        if (randomValue > CAR_PROCEED_CRITERIA) {
            position++;
        }
    }

    private String makePositionUI() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            stringBuilder.append(POSITION_HYPHON);
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return makePositionUI();
    }
}
