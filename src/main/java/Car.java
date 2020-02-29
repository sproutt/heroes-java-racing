import java.util.ArrayList;
import java.util.List;

public class Car implements Comparable<Car> {
    private String name;
    private int lastPosition;
    private List<Integer> allPositions;

    public Car(String name) throws OutOfLengthException {
        setName(name);

        this.lastPosition = 0;
        allPositions = new ArrayList<>(lastPosition);
    }

    public String getName() {
        return name;
    }

    public int getLastPosition() {
        return lastPosition;
    }

    public List<Integer> getAllPositions() {
        return allPositions;
    }

    private void setName(String name) throws OutOfLengthException {
        if (name.length() > RacingGame.CAR_NAME_MAXIMUM) {
            throw new OutOfLengthException("The length of car name '" + name + "' is over 5.", name.length());
        } else if (name.isEmpty()) {
            throw new NullPointerException("Input car names to race.");
        }

        this.name = name;
    }

    public void move(int randomNumber) {
        if (randomNumber >= RacingGame.MINIMUM_TO_MOVE) {
            lastPosition++;
        }

        allPositions.add(lastPosition);
    }

    @Override
    public int compareTo(Car car) {
        return lastPosition - car.lastPosition;
    }

}
