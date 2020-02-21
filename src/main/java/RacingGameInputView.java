import java.util.Scanner;

public final class RacingGameInputView {
    public static String scanCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return new Scanner(System.in).nextLine();
    }

    public static int scanTrialTime() {
        System.out.println("시도할 회수는 몇회인가요?");
        return new Scanner(System.in).nextInt();
    }
}

