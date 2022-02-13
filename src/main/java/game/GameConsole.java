package game;

import car.Car;
import car.CarFactory;
import view.InputView;
import view.OutputView;

import java.util.List;

public class GameConsole {
    private static final String NOT_NUMBER_ERROR_MESSAGE = "[ERROR] 문자가 아닌 숫자를 입력해야한다.\n";

    private Game game;

    public void run() {
        generateGame();
        List<Car> carList = CarFactory.createCarList(game.getNumberOfCar());

        for (int i = 0; i < game.getTrialCount(); i++) {
            play(carList);
        }
        printResult(carList);
    }

    private void generateGame() {
        try {

            game = new Game(InputView.inputCarCount(), InputView.inputTrialCount());
        } catch (NumberFormatException exception) {
            System.out.println(NOT_NUMBER_ERROR_MESSAGE);
            generateGame();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            generateGame();
        }
    }

    private void play(List<Car> carList) {
        for (Car car : carList) {
            car.move(game.createRandomValue());
        }
    }

    private void printResult(List<Car> carList) {
        OutputView.showResult();
        for (Car car : carList) {
            OutputView.showCarResult(car.toString());
        }
    }
}
