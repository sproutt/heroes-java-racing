
public class RacingGame {
    private int time;
    private Cars cars;

    public RacingGame() {
        cars = new Cars(RacingGameInputView.scanCarNames());
        this.time = RacingGameInputView.scanTrialTime();
    }

    public RacingGame(String carNames, int time) {
        cars = new Cars(carNames);
        this.time = time;
    }

    public void start() {
        RacingGameResultView.printExecutionMessage();

        for (int i = 0; i < time; i++) {
            cars.move();
            RacingGameResultView.printRacingProgress(cars);
        }
    }

    public void showResult() {
        RacingGameResultView.printResultMessage(getWinner(cars));
    }

    public Cars getWinner(Cars cars) {
        Cars winner = cars;
        int maxPosition = cars.getCars().stream().max(Car::compareTo).get().getPosition();

        winner.getCars().removeIf(t -> t.getPosition() != maxPosition);

        return winner;
    }

    public String getRacingCarNames() {
        return cars.getCarNames();
    }
}