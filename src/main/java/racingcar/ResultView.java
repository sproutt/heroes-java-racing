package racingcar;

import java.util.ArrayList;
import java.util.List;

public class ResultView{
    private static final char BAR = '-';
    private static final String COLON = " : ";

    public static void showResultMessage() {
        System.out.println("실행 결과");
    }

    public static void showResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getCarName() + COLON);
            showPositionWithBar(car);
            System.out.println();
        }
        System.out.println();
    }

    public static void showPositionWithBar(Car car) {
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print(BAR);
        }
    }

    public static void showWinner(List<Car> winners) {
        ArrayList winnerCars = new ArrayList<>();
        for (Car car : winners) {
            winnerCars.add(car.getCarName());
        }
        System.out.print(winnerCars);
        System.out.println("가 최종 우승했습니다.");
    }
}
