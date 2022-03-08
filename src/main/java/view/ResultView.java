package view;

import model.Car;

import java.util.List;

public class ResultView {

    private static final String RESULT_SYMBOL = "-";

    public static void printAllCarsState(long id, int len) {
        System.out.println("car" + id);
        for (int i = 0; i < len; i++) {
            System.out.print(RESULT_SYMBOL);
        }
        System.out.println();
    }
}