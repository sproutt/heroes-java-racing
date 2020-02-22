package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {
    private List<Car> cars;
    private int carNumber;
    private int runNumber;

    public RacingGame(String carNames, int runNumber) {
        this.cars = setCarNames(carNames);
        this.runNumber = runNumber;
    }

    public List<Car> setCarNames(String carNames) {
        String[] names = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < carNumber; i++) {
            cars.add(new Car());
        }
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public boolean randomScopeCheck() {
        if(new Random().nextInt(10) >= 4){
            return true;
        }
        return false;
    }

    public List<Car> move() {
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

    /*
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        String carNames = InputView.getInputNameOfCars();
        int runNumber = InputView.getInputRunNumber();

        RacingGame racingGame = new RacingGame(carNames, runNumber);
        ResultView.showResultMessage();

        for(int i = 0; i < runNumber; i++) {
            racingGame.move();
            ResultView.showResult(racingGame.getCars());
        }

        Winners winners = new Winners(racingGame.getCars());
        ResultView.showWinner(winners.getCars());

    }

     */
}
