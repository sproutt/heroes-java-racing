package view;

import model.Car;

import java.util.List;

public class ResultView {
    public static void printRacing(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.visualizePosition());
        }
        System.out.println();
    }

    public static void printWinner(List<String> winner) {
        System.out.println(winner + "가 최종 우승 했습니다.");
    }
}
