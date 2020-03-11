package racingcar;

import java.util.ArrayList;
import java.util.List;

public class ResultView{
    private static final String CARPOSITIONBAR = "-";
    private static final String NAMENEXTCOLON = " : ";
    private static final String RESULTMESSAGE = "실행결과";
    private static final String WINNERMESSAGE = "가 최종 우승했습니다.";
    public static void showResultMessage() {
        System.out.println(RESULTMESSAGE);
    }

    public static void showResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getCarName() + NAMENEXTCOLON);
            showPositionWithBar(car);
            System.out.println();
        }
        System.out.println();
    }

    public static void showPositionWithBar(Car car) {
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print(CARPOSITIONBAR);
        }
    }

    public static void showWinner(List<Car> winners) {
        List<String> winnerCars = new ArrayList<String>();
        for (Car car : winners) {
            winnerCars.add(car.getCarName());
        }
        System.out.print(winnerCars);
        System.out.println(WINNERMESSAGE);
    }
}
