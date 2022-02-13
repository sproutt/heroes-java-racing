package view;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_CARS_NUMBER = "자동차 대수는 몇 대 인가요?";
    private static final String INPUT_TRY_COUNT = "시도할 횟수는 몇 회 인가요?";
    private Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public int inputCarsNumber() {
        System.out.println(INPUT_CARS_NUMBER);
        return scanner.nextInt();
    }

    public int inputTryCount() {
        System.out.println(INPUT_TRY_COUNT);
        return scanner.nextInt();
    }
}
