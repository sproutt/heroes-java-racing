import java.util.List;

public class GameConsole {
    private Game game;

    public void run() {
        game = new Game(InputView.inputCarCount(), InputView.inputTrialCount());
        List<Car> carList = CarFactory.createCarList(game.getNumberOfCar());

        for (int i = 0; i < game.getTrialCount(); i++) {
            play(carList);
        }
        printResult(carList);
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
