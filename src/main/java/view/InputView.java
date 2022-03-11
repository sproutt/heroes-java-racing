package view;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {

    Scanner sc;
    private static final String CARS_COUNT = "자동차 대수는 몇 대 인가요?";
    private static final String PUT_NATURAL_NUMBER = "음수가 아닌 자연수를 입력해주세요";
    private static final String TRIAL_COUNT = "시도할 횟수는 몇 회 인가요?";
    private static final String DO_NOT_PUT_STRING = "문자열이 아닌 자연수를 입력해주세요";

    public InputView() {
        sc = new Scanner(System.in);
    }

    public long inputTotalCarNum() {
        System.out.println(CARS_COUNT);
        long carCount = 0L;
        try {
            carCount = Long.parseLong(sc.nextLine());
            if (carCount <= 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(PUT_NATURAL_NUMBER);
            return inputTotalCarNum();
        } catch (InputMismatchException exception) {
            System.out.println(DO_NOT_PUT_STRING);
            return inputTotalCarNum();
        }
        return carCount;
    }

    public int inputTotalTrial() {
        System.out.println(TRIAL_COUNT);
        int trial = 0;
        try {
            trial = Integer.parseInt(sc.nextLine());
            if (trial <= 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(PUT_NATURAL_NUMBER);
            return inputTotalTrial();
        } catch (InputMismatchException exception) {
            System.out.println(DO_NOT_PUT_STRING);
            return inputTotalTrial();
        }
        return trial;
    }
}
