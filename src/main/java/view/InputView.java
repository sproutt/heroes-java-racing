package view;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView{

    Scanner sc;

    public InputView() {
        sc = new Scanner(System.in);
    }

    public long inputTotalCarNum(){
        System.out.println("자동차 대수는 몇 대 인가요?");
        long carNum = 0L;
        try {
            carNum = Long.parseLong(sc.nextLine());
            if (carNum <= 0)
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException | InputMismatchException exception) {
            System.out.println("자연수를 입력해주세요");
            return inputTotalCarNum();
        }
        return carNum;

    }

    public int inputTotalTrial(){
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int trial = 0;
        try {
            trial = Integer.parseInt(sc.nextLine());
            if (trial <= 0)
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException | InputMismatchException exception) {
            System.out.println("자연수를 입력해주세요");
            return inputTotalTrial();
        }
        return trial;
    }
}
