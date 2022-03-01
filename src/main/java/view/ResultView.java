package view;

import model.Car;

import java.util.List;

public class ResultView {

    public static void printAllCarsState(long carNum, int len) {
        System.out.print("car" + carNum + " : ");
        for (int i = 0; i < len; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}