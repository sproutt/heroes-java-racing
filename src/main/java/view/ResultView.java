package view;

import model.Car;

import java.util.List;

public class ResultView {
    private final static String POSITION_VISUALIZATION = "-";

    public static void printRacing(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(visualizeCarPosition(car));
        }
        System.out.println();
    }

    private static String visualizeCarPosition(Car car) {
        StringBuilder racingBar = new StringBuilder();
        racingBar.append(car.getCarName() + ": ");
        for (int i = 0; i < car.getCarPosition(); i++) {
            racingBar.append(POSITION_VISUALIZATION);
        }
        return racingBar.toString();
    }

    public static void printWinner(List<String> winners) {
        System.out.println(winners + "가 최종 우승 했습니다.");
    }
}
