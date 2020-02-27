import java.util.Comparator;
import java.util.List;

public class ResultView {

    private final static String MOVING_BAR = "-";
    private final static int MOVING = 1;


    public void printRacingGameResult(RacingGame racingGame) {
        System.out.println("실행 결과");
        for (int time = 0; time < racingGame.getAttemptNumber(); time++) {
            printRacingGameHistory(racingGame, time);
            System.out.println();
        }
        printWinnerCar(racingGame);
    }

    private void printRacingGameHistory(RacingGame racingGame, int time) {
        racingGame.getCars().forEach(car ->
            System.out.println(car.getName() + " : " + getMovingBars(car.getMovingStatuses(),time))
        );
    }

    private String getMovingBars(List<Integer> movingStatuses,int time) {
        String movingBars = "";
        for (int index = 0; index <= time ; index++) {
            movingBars += getMovingBar(movingStatuses.get(index));
        }
        return movingBars;
    }

    private String getMovingBar(int movingStatus) {
        if (movingStatus == MOVING) {
            return MOVING_BAR;
        }
        return "";
    }

    private void printWinnerCar(RacingGame racingGame) {
        List<Car> cars = racingGame.getCars();
        int maxLocation = cars.stream().max(Comparator.comparingInt(Car::getLocation)).get().getLocation();
        cars.removeIf(car -> car.getLocation() != maxLocation);
        cars.forEach(car -> System.out.print(car.getName() + " "));
        System.out.println("가 최종 우승했습니다.");
    }
}
