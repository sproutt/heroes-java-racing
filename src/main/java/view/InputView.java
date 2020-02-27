package view;

import java.util.Scanner;

public class InputView{

    public static String[] inputCarName(Scanner scanner){
        System.out.println("경주할 차의 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        return scanner.nextLine().split(",");
    }

    public static int inputNumberOfTrials(Scanner scanner){
        System.out.println("시도할 횟수는 몇회인가요?");
        return scanner.nextInt();
    }
}