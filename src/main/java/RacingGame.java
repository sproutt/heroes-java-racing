import java.util.List;

public class RacingGame {
    public static final int MINIMUM_TO_MOVE = 4;
    public static final int CAR_NAME_MAXIMUM = 5;
    private int trialTime;
    private Cars racingCars;

    public RacingGame(String carNames, int trialTime) {
        racingCars = new Cars(carNames);
        this.trialTime = trialTime;
    }

    public Cars getRacingCars() {
        return this.racingCars;
    }

    public int getTrialTime() {
        return this.trialTime;
    }

    public void startGame() {
        if (racingCars.getCars().size() <= 1) {
            return;
        }

        for (int i = 0; i < this.trialTime; i++) {
            racingCars.move();
        }
    }

    public Cars getWinner() {
        Cars winner = new Cars(racingCars);
        int maxPosition = racingCars.getCars().stream().max(Car::compareTo).get().getLastPosition();

        winner.getCars().removeIf(t -> t.getLastPosition() != maxPosition);

        return winner;
    }

    public List<String> getRacingCarNames() {
        return racingCars.getCarNames();
    }
}