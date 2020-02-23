package model;

import java.util.ArrayList;
import java.util.List;

public class RacingGameResult {
    private List<Car> cars;
    private List<String> winner;

    public RacingGameResult(List<Car> cars) {
        this.cars = cars;
    }

    public List<String> getWinners() {
        winner = new ArrayList<String>();
        int max = findMaxPosition();

        for (Car car : cars) {
            addWinner(max, car);
        }
        return winner;
    }

    private int findMaxPosition() {
        int max = this.cars.stream()
                .mapToInt(Car::getCarPosition)
                .max()
                .getAsInt();
        return max;
    }

    private void addWinner(int max, Car car) {
        if (car.getCarPosition() == max) {
            winner.add(car.getCarName());
        }
    }
}
