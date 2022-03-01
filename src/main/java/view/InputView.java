package view;

import java.util.Scanner;

public class InputView{

    Scanner sc;

    public InputView() {
        sc = new Scanner(System.in);
    }

    public long inputTotalCarNum(){
        System.out.println("자동차 대수는 몇 대 인가요?");
        return sc.nextLong();
    }

    public int inputTotalTrial(){
        System.out.println("시도할 횟수는 몇 회 인가요?");
        return sc.nextInt();
    }
}
