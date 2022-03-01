package view;

import exception.InputViewException;
import view.validation.InputValidator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private static final String INPUT_CARS_NUMBER = "자동차 대수는 몇 대 인가요?";
    private static final String INPUT_TRY_COUNT = "시도할 횟수는 몇 회 인가요?";
    private Scanner scanner;
    private InputValidator inputValidator;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
        inputValidator = new InputValidator();
    }

    public int inputCarsNumber() {
        System.out.println(INPUT_CARS_NUMBER);
        String carsNumber = scanner.nextLine();
        try {
            inputValidator.validateNumber(carsNumber);
            inputValidator.validatePositiveAndNotZeroNumber(Integer.parseInt(carsNumber));
        } catch (InputViewException | InputMismatchException inputViewException) {
            System.out.println(inputViewException.getMessage());
            return inputCarsNumber();
        }
        return Integer.parseInt(carsNumber);
    }

    public int inputTryCount() {
        System.out.println(INPUT_TRY_COUNT);
        String tryCount = scanner.nextLine();
        try {
            inputValidator.validateNumber(tryCount);
            inputValidator.validatePositiveAndNotZeroNumber(Integer.parseInt(tryCount));
        } catch (InputViewException | InputMismatchException inputViewException) {
            System.out.println(inputViewException.getMessage());
            return inputTryCount();
        }
        return Integer.parseInt(tryCount);
    }
}
