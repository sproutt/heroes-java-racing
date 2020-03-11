package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {
    private List<Car> cars;
    private int time;
    private Random random = new Random();
    private int boundaryNum = random.nextInt(10);
    public RacingGame(String carNames, int time) {
        this.cars = setCarNames(carNames);
        this.time = time;
    }

    public List<Car> setCarNames(String carNames) {
        String[] names = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public boolean randomScopeCheck() {
        if(boundaryNum >= 4){
            return true;
        }
        return false;
    }

    public void start() {
        for(int i = 0; i < time; i++) {
            startGame();
            ResultView.showResult(getCars());
        }
    }

    public List<Car> startGame() {
        moveCar();
        return cars;
    }

    private void moveCar(){
        for (Car car : cars) {
            moveOrNot(car);
        }
    }

    private void moveOrNot(Car car){
        if (randomScopeCheck()) {
            car.move();
        }
    }

    public List<Car> getCars() {
        return cars;
    }

}
