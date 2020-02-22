package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Winners {
    private List<Car> winners;
    private int maxPosition;

    public Winners(List<Car> cars) {
        winners = new ArrayList<>();
        this.winners = getWinner(cars);
    }

    public List<Car> getWinner(List<Car> cars) {
        maxPosition = 0;
        for (Car car : cars) {
            setMaxPosition(car);
        }
        for (Car car : cars) {
            checkWinner(car);
        }
        return winners;
    }

    public void setMaxPosition(Car car) {
        if (car.getPosition() > maxPosition) {
            maxPosition = car.getPosition();
        }
    }

    public void checkWinner(Car car) {
        if (car.getPosition() == maxPosition) {
            winners.add(car);
        }
    }

    public List<Car> getCars() {
        return winners;
    }

}
