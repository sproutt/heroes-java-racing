package view;

import model.Car;

import java.util.List;

public class ResultView {

    public static void printAllCarsState(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}