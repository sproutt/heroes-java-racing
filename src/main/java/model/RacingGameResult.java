package model;

import java.util.ArrayList;
import java.util.List;

public class RacingGameResult {
    private List<Car> cars;
    private List<String> winners;

    public RacingGameResult(List<Car> cars) {
        this.cars = cars;
    }

    public List<String> getWinners() {
        winners = new ArrayList<>();
        int max = findMaxPosition();

        for (Car car : cars) {
            addWinner(max, car);
        }
        return winners;
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
            winners.add(car.getCarName());
        }
    }
}
