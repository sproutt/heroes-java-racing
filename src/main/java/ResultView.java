import java.util.List;

public class ResultView {
    public void printRacingGameStatus(RacingGame racingGame) {
        List<Car> cars = racingGame.getCars();
        cars.forEach(car -> {
            System.out.println(car.getName() + " : " + car.convertLocationToBars());
        });
        System.out.println();
    }

    public void printExecutionResultSentence() {
        System.out.println("실행 결과");
    }

    public void printRacingGameResult(List<Car> winnerCars) {
        winnerCars.forEach(winnerCar -> System.out.print(winnerCar.getName() + " "));
        System.out.println("가 최종 우승했습니다.");
    }
}
